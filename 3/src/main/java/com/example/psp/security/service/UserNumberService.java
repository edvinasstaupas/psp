package com.example.psp.security.service;

import com.example.psp.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserNumberService {

    private final UserRepository userRepository;

    public String getUserNumber() {
        return "" + (userRepository.getBiggestUserNumber() + 1);
    }
}
