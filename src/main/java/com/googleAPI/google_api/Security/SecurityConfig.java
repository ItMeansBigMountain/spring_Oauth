package com.googleAPI.google_api.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;


//REDIRECT URL --> localhost:8080/login.oauth2/code/google
@Configuration
public class SecurityConfig {


    // DEFINE WHICH ENDPOINTS REQUIRE AUTH
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login();
        return http.build();
    }


}
