package com.hostel.hostelmanagement.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Only allow admin@gmail.com / admin123
        if ("admin@gmail.com".equals(username)) {
            return User.builder()
                    .username("admin@gmail.com")
                    .password(passwordEncoder.encode("admin123"))
                    .roles("ADMIN")
                    .build();
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
