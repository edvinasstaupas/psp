package com.example.psp.security.service;


import com.example.psp.security.entities.Role;
import com.example.psp.security.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService implements IEntityService<Role, Role, Role> {

    private final RoleRepository roleRepository;

    @Override
    public void save(Role role) {

    }

    @Override
    public void delete(Role role) {

    }

    @Override
    public Role getById(Long id) {
        return null;
    }

    @Override
    public List<Role> getAllDto() {
        return null;
    }

    @Override
    public Role getByIdDto(Long id) {
        return null;
    }

    @Override
    public void update(Role role) {

    }

    @Override
    public Role create(Role role) {
        return null;
    }
}

