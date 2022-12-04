package com.example.psp.security.service;

import com.example.psp.security.dto.CreateUserDto;
import com.example.psp.security.dto.UserDto;
import com.example.psp.security.entities.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper implements IMapper<User, UserDto, CreateUserDto> {

    private final ModelMapper modelMapper;

    @Override
    public UserDto convertToDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public User convertToDomain(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }

    @Override
    public User convertToDomainFromCreate(CreateUserDto createUserDto) {
        return modelMapper.map(createUserDto, User.class);
    }
}
