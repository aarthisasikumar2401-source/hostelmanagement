package com.hostel.hostelmanagement.config;

import com.hostel.hostelmanagement.service.CustomUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final CustomUserDetailsService userDetailsService;

    public SecurityConfig(CustomUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    // Use plain text passwords for demo purposes
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance(); // only for testing/demo
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/index.html", "/perform_login", "/static/**").permitAll() // allow login page & static files
                        .anyRequest().authenticated() // all other pages require login
                )
                .formLogin(form -> form
                        .loginPage("/index.html")             // your login page
                        .loginProcessingUrl("/perform_login") // POST URL for login form
                        .defaultSuccessUrl("/dashboard.html", true) // redirect on successful login
                        .failureUrl("/index.html?error=true")      // redirect on failed login
                        .usernameParameter("email")                 // must match input name="email"
                        .passwordParameter("password")             // must match input name="password"
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/index.html")
                        .permitAll()
                );

        return http.build();
    }
}
