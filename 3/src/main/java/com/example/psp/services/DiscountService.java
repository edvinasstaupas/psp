package com.example.psp.services;

import com.example.psp.dto.AssignDiscountToBrandDTO;
import com.example.psp.dto.AssignDiscountToCategoryDTO;
import com.example.psp.dto.AssignDiscountToItemDTO;
import com.example.psp.dto.Discount;
import com.example.psp.dto.DiscountDto;
import com.example.psp.mapper.DiscountMapper;
import com.example.psp.model.Brand;
import com.example.psp.model.Category;
import com.example.psp.model.DiscountProduct;
import com.example.psp.model.Product;
import com.example.psp.repositories.BrandRepository;
import com.example.psp.repositories.CategoryRepository;
import com.example.psp.repositories.DiscountProductRepository;
import com.example.psp.repositories.DiscountRepository;
import com.example.psp.repositories.ProductRepository;
import com.example.psp.repositories.TenantRepository;
import com.example.psp.security.SecurityUtils;
import com.example.psp.security.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService {
    private final DiscountRepository discountRepository;
    private final DiscountProductRepository discountProductRepository;
    private final ProductRepository productRepository;
    private final BrandRepository brandRepository;
    private final CategoryRepository categoryRepository;
    private final DiscountMapper discountMapper;
    private final TenantRepository tenantRepository;

    public DiscountService(DiscountRepository discountRepository, DiscountProductRepository discountProductRepository, ProductRepository productRepository,
            BrandRepository brandRepository, CategoryRepository categoryRepository, DiscountMapper discountMapper, TenantRepository tenantRepository) {
        this.discountRepository = discountRepository;
        this.discountProductRepository = discountProductRepository;
        this.productRepository = productRepository;
        this.brandRepository = brandRepository;
        this.categoryRepository = categoryRepository;
        this.discountMapper = discountMapper;
        this.tenantRepository = tenantRepository;
    }

    public void createDiscount(DiscountDto discountDto, User user) {
        com.example.psp.model.Discount discount = new com.example.psp.model.Discount();
        discount.setTenant(tenantRepository.findById(user.getTenantId()).orElseThrow());

        discountMapper.update(discountDto, discount);
        discountRepository.save(discount);
    }

    public List<Discount> getDiscounts(Integer pageSize, Integer pageNumber, User user) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        Page<com.example.psp.model.Discount> discounts = discountRepository.findAll(pageRequest);
        return discountMapper.mapDiscounts(discounts.getContent());
    }

    public void updateDiscount(Integer id, DiscountDto discountDto, User user) {
        com.example.psp.model.Discount discount = discountRepository.findById(id).orElseThrow();
        SecurityUtils.checkTenantId(discount.getTenant().getId(), user);
        discountMapper.update(discountDto, discount);
        discountRepository.save(discount);
    }

    public Discount getDiscount(Integer id, User user) {
        com.example.psp.model.Discount discount = discountRepository.findById(id).orElseThrow();
        SecurityUtils.checkTenantId(discount.getTenant().getId(), user);
        return discountMapper.map(discount);
    }

    public void assignDiscountToItem(AssignDiscountToItemDTO assignDiscountToItemDTO, User user) {
        Integer productId = assignDiscountToItemDTO.getProductId().orElse(null);
        Product product = productRepository.findById(productId).orElseThrow();
        Integer discountId = assignDiscountToItemDTO.getDiscountId();
        DiscountProduct discount = discountProductRepository.findById(discountId).orElseThrow();
        SecurityUtils.checkTenantId(discount.getTenant().getId(), user);

        product.getDiscounts().add(discount);

        productRepository.save(product);
    }

    public void assignDiscountToCategory(AssignDiscountToCategoryDTO assignDiscountToCategoryDTO, User user) {
        SecurityUtils.checkTenantId(assignDiscountToCategoryDTO.getDiscountId(), user);
        Integer brandId = assignDiscountToCategoryDTO.getCategoryId();
        Category category = categoryRepository.findById(brandId).orElseThrow();
        DiscountProduct discount = discountProductRepository.findById(assignDiscountToCategoryDTO.getDiscountId()).orElseThrow();
        SecurityUtils.checkTenantId(discount.getTenant().getId(), user);

        category.getProducts().forEach(product -> product.getDiscounts().add(discount));

        categoryRepository.save(category);
    }

    public void assignDiscountToBrand(AssignDiscountToBrandDTO assignDiscountToBrandDTO, User user) {
        SecurityUtils.checkTenantId(assignDiscountToBrandDTO.getDiscountId(), user);
        Integer brandId = assignDiscountToBrandDTO.getBrandId();
        Brand brand = brandRepository.findById(brandId).orElseThrow();
        DiscountProduct discount = discountProductRepository.findById(assignDiscountToBrandDTO.getDiscountId()).orElseThrow();
        SecurityUtils.checkTenantId(discount.getTenant().getId(), user);

        brand.getProducts().forEach(product -> product.getDiscounts().add(discount));

        brandRepository.save(brand);
    }
}

