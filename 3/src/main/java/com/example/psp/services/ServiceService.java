package com.example.psp.services;

import com.example.psp.dto.ServiceDto;
import com.example.psp.security.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {

    public void serviceIdDelete(Integer id, User user)  {}

    public com.example.psp.dto.Service serviceIdGet(Integer id, User user) {
        return null;
    }

    public void serviceIdPut(Integer id, ServiceDto serviceDto, User user)  {}

    public List<com.example.psp.dto.Service> servicePageSizePageNumberGet(Integer pageSize, Integer pageNumber, User user) {
        return null;
    }

    public void servicePost(ServiceDto serviceDto, User user) {}
}