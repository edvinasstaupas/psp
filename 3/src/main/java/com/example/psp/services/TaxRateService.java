package com.example.psp.services;

import com.example.psp.mapper.TaxRateMapper;
import com.example.psp.dto.ApplyTaxRateToCategoryDTO;
import com.example.psp.dto.AssignTaxRateToItemDTO;
import com.example.psp.dto.TaxRate;
import com.example.psp.dto.TaxRateDto;
import com.example.psp.model.Category;
import com.example.psp.model.Product;
import com.example.psp.model.Tenant;
import com.example.psp.repositories.CategoryRepository;
import com.example.psp.repositories.ProductRepository;
import com.example.psp.repositories.TaxRateRepository;
import com.example.psp.repositories.TenantRepository;
import com.example.psp.security.User;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxRateService {
    private final TaxRateRepository taxRateRepository;
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final TenantRepository tenantRepository;
    private final TaxRateMapper taxRateMapper;

    public TaxRateService(TaxRateRepository taxRateRepository, CategoryRepository categoryRepository, ProductRepository productRepository,
            TenantRepository tenantRepository, TaxRateMapper taxRateMapper) {
        this.taxRateRepository = taxRateRepository;
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
        this.tenantRepository = tenantRepository;
        this.taxRateMapper = taxRateMapper;
    }

    @Transactional
    public void applyTaxToCategory(ApplyTaxRateToCategoryDTO applyTaxRateToCategoryDTO, User user) {
        Category category = categoryRepository.findById(applyTaxRateToCategoryDTO.getCategoryId()).orElseThrow();
        com.example.psp.model.TaxRate rate = taxRateRepository.getReferenceById(applyTaxRateToCategoryDTO.getTaxRateId());
        List<Product> products = category.getProducts().stream()
                .map(product -> {
                    product.setTaxRate(rate);
                    return product;
                })
                .toList();
        productRepository.saveAll(products);
    }

    public void assignTaxRate(AssignTaxRateToItemDTO assignTaxRateToItemDTO, User user) {
        com.example.psp.model.TaxRate rate = taxRateRepository.findById(assignTaxRateToItemDTO.getTaxRateId()).orElseThrow();
        Integer productId = assignTaxRateToItemDTO.getProductId().orElse(null);
        Product product = productRepository.findById(productId).orElseThrow();
        product.setTaxRate(rate);

        productRepository.save(product);
    }

    public void deleteTaxRate(Integer id, User user) {
        taxRateRepository.deleteById(id);
    }

    public TaxRate getTaxRate(Integer id, User user) {
        com.example.psp.model.TaxRate rate = taxRateRepository.findById(id).orElseThrow();
        return taxRateMapper.map(rate);
    }

    public void putTaxRate(Integer id, TaxRateDto taxRateDto, User user) {
        com.example.psp.model.TaxRate taxRate = taxRateRepository.findById(id).orElseThrow();
        taxRateMapper.update(taxRateDto, taxRate);
        taxRateRepository.save(taxRate);
    }

    public List<TaxRate> getTaxRates(Integer pageSize, Integer pageNumber, User user) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        Page<com.example.psp.model.TaxRate> taxRates = taxRateRepository.findAll(pageRequest);
        return taxRateMapper.mapTaxRates(taxRates.getContent());
    }

    public void createTaxRate(TaxRateDto taxRateDto, User user) {
        com.example.psp.model.TaxRate entity = new com.example.psp.model.TaxRate();
        taxRateMapper.update(taxRateDto, entity);
        Tenant tenant = tenantRepository.findById(user.getTenantId()).orElseThrow();
        entity.setTenant(tenant);

        taxRateRepository.save(entity);
    }
}
