package com.googleAPI.google_api.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class REST_Controller {



    // RESTRICTED
    @GetMapping("/restricted")
    public String restricted() {
        return "you must have been logged into see this";
    }






}