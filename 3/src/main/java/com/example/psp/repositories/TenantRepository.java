package com.example.psp.repositories;

import com.example.psp.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Integer> {
    Tenant findTenantById(Integer id);
}
