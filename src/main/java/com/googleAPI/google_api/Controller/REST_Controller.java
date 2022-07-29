package com.googleAPI.google_api.Controller;
import com.googleAPI.google_api.Service.RenderService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class REST_Controller {

    @Autowired
    private RenderService renderService;


    @GetMapping("/user")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        return this.renderService.fetch_user_data(principal) ;
    }


}