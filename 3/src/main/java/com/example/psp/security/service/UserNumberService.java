package com.example.psp.security.service;

import com.example.psp.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserNumberService {

    private final UserRepository userRepository;

    public String getUserNumber() {
        int num;
        try {
            num = userRepository.getBiggestUserNumber();
        } catch (Exception e) {
            num = 0;
        }
        return "" + (num + 1);
    }

}
