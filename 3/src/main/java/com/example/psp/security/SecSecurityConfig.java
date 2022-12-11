package com.example.psp.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecSecurityConfig {

    private final PasswordEncoder passwordEncoder;

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository, RoleRepository roleRepository) {
        User employee = new User(
                "employee",
                passwordEncoder.encode("e"),
                RoleFactory.getAuthorities(new String[]{"EMPLOYEE"}),
                1);

        User admin = new User(
                "admin",
                passwordEncoder.encode("a"),
                RoleFactory.getAuthorities(new String[]{"EMPLOYEE", "ADMIN"}),
                1);

        User customer = new User(
                "customer",
                passwordEncoder.encode("c"),
                RoleFactory.getAuthorities(new String[]{"CUSTOMER"}),
                1);

        return new CustomUserDetailsService(userRepository, roleRepository, employee, admin, customer);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .headers()
                .frameOptions()
                .disable()
                .and()
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers(new AntPathRequestMatcher("/h2/**"))
                        .permitAll()
                        .anyRequest().authenticated())
                .httpBasic();
        return http.build();
    }

}
