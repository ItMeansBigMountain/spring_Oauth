package com.googleAPI.google_api.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class BOOT_Controller {



    //HOME PAGE
    @GetMapping("/")
    public String home() {
        return "homepage";
    }


}