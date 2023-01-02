package com.example.psp.services;

import com.example.psp.dto.ServiceDto;
import com.example.psp.mapper.ServiceMapper;
import com.example.psp.model.TaxRate;
import com.example.psp.repositories.ServiceRepository;
import com.example.psp.repositories.TaxRateRepository;
import com.example.psp.repositories.TenantRepository;
import com.example.psp.security.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;
    private final TaxRateRepository taxRateRepository;
    private final TenantRepository tenantRepository;
    private final ServiceMapper serviceMapper;

    public ServiceService(ServiceRepository serviceRepository, TaxRateRepository taxRateRepository, TenantRepository tenantRepository, ServiceMapper serviceMapper) {
        this.serviceRepository = serviceRepository;
        this.taxRateRepository = taxRateRepository;
        this.tenantRepository = tenantRepository;
        this.serviceMapper = serviceMapper;
    }

    public void deleteServiceById(Integer id, User user) {
        serviceRepository.deleteById(id);
    }

    public com.example.psp.dto.Service getServiceById(Integer id, User user) {
        com.example.psp.model.Service service = serviceRepository.findById(id).orElseThrow();
        return serviceMapper.map(service);
    }

    public void updateService(Integer id, ServiceDto serviceDto, User user) {
        com.example.psp.model.Service service = serviceRepository.findById(id).orElseThrow();
        finishUpdate(serviceDto, service);
    }

    public List<com.example.psp.dto.Service> getServices(Integer pageSize, Integer pageNumber, User user) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        Page<com.example.psp.model.Service> services = serviceRepository.findAll(pageRequest);
        return serviceMapper.map(services.getContent());
    }

    public void createService(ServiceDto serviceDto, User user) {
        com.example.psp.model.Service service = new com.example.psp.model.Service();
        service.setTenant(tenantRepository.findById(user.getTenantId()).orElseThrow());

        finishUpdate(serviceDto, service);
    }

    private void finishUpdate(ServiceDto serviceDto, com.example.psp.model.Service service) {
        serviceMapper.update(serviceDto, service);
        TaxRate taxRate = taxRateRepository.findById(serviceDto.getTaxRateId()).orElseThrow();
        service.setTaxRate(taxRate);

        serviceRepository.save(service);
    }
}