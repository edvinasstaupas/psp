package com.example.psp.security.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class CreateUserDto {

    private String firstName;

    private String lastName;

    private String password;

    private String password2;

}
