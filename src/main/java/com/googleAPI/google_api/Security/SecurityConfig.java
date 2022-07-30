package com.googleAPI.google_api.Security;

import com.googleAPI.google_api.Dao.UserDao;
import com.googleAPI.google_api.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Map;


//REDIRECT URL --> localhost:8080/login/oauth2/code/google
@Configuration
public class SecurityConfig {


    @Autowired
    UserDao userDao;


    // DEFINE WHICH ENDPOINTS REQUIRE AUTH
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
                .successHandler(
                        //SUCCESSFUL LOGIN
                        (request, response, obj) -> {
                            OAuth2User user_auth_details = (OAuth2User) obj.getPrincipal();
                            User user = new User(user_auth_details.getAttribute("email"), user_auth_details.getAttribute("iss").toString() , user_auth_details.getName());
                            userDao.save(user);
                            response.sendRedirect("/home");
                        }
                );
        return http.build();
    }


}
