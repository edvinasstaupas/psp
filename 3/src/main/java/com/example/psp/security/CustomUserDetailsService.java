package com.example.psp.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    public CustomUserDetailsService(UserRepository userRepository, RoleRepository roleRepository, User... users) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        for (User user : users) {
//            createInitialUsers(user);
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.getByUsername(username);
    }
//
//    public void createInitialUsers(User user) {
//        user.getAuthorities().forEach(r -> roleRepository.save((Role) r));
//        roleRepository.flush();
//        save(user);
//    }

    public void create(User user) {
        if (userRepository.getByUsername(user.getUsername()) != null) {
            throw new IllegalArgumentException();
        }

        save(user);
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public User getById(String id) {
        return userRepository.findById(id).get();
    }

}
