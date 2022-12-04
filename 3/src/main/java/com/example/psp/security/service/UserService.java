package com.example.psp.security.service;

import com.example.psp.security.dto.CreateUserDto;
import com.example.psp.security.dto.UserDto;
import com.example.psp.security.entities.User;
import com.example.psp.security.exception.NoSuchUserException;
import com.example.psp.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService implements IEntityService<User, UserDto, CreateUserDto>, UserDetailsService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    private final UserNumberService userNumberService;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NoSuchUserException(id));
    }

    @Override
    public List<UserDto> getAllDto() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto getByIdDto(Long id) {
        return userMapper.convertToDto(getById(id));
    }

    @Override
    public UserDto create(CreateUserDto createUserDto) {
        User user = userMapper.convertToDomainFromCreate(createUserDto);
        user.setRoles(Set.of(RoleFactory.getUserRole()));
        save(user);
        return userMapper.convertToDto(user);
    }

    @Override
    public void update(UserDto userDto) {
        User user = userMapper.convertToDomain(userDto);
        save(user);
    }

    public UserDto getByUserNumberDto(String userNumber) {
        return userMapper.convertToDto(getByUserNumber(userNumber));
    }

    public User getByUserNumber(String userNumber) {
        User user = userRepository.findByUserNumber(userNumber);
        if (user == null)
            throw new NoSuchUserException(userNumber);
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String userNumber) throws UsernameNotFoundException {
        return userRepository.loadByUserNumber(userNumber);
    }

    public UserDto register(CreateUserDto createUserDto) {
        if (!createUserDto.getPassword().equals(createUserDto.getPassword2()))
            throw new RuntimeException(); //TODO change to specific exception
        User user = userMapper.convertToDomainFromCreate(createUserDto);
        user.setUserNumber(userNumberService.getUserNumber());
        user.getRoles().add(RoleFactory.getUserRole());
        user.setPassword("{bcrypt}" + passwordEncoder.encode(user.getPassword()));
        save(user);
        return userMapper.convertToDto(user);
    }
}
