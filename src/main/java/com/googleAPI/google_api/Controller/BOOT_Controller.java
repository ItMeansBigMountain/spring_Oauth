package com.googleAPI.google_api.Controller;
import com.googleAPI.google_api.Service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Controller
public class BOOT_Controller {


    @Autowired
    private RenderService renderService;


    //HOME PAGE
    @GetMapping("/")
    public String home(@AuthenticationPrincipal OAuth2User principal) {
        return "homepage";
    }




    //PROFILE PAGE
    @GetMapping("/home")
    public String profile(@AuthenticationPrincipal OAuth2User principal , Model model) {
        Map<String, Object> user_info = this.renderService.fetch_user_data(principal);
        model.addAllAttributes(user_info);
        return "profile";
    }




}