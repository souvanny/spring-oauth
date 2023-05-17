package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OauthLoginController {
    @RequestMapping("/oauthlogin")
    public ModelAndView oauthloginPage() {
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
        System.out.println("--");

        String message = "oauthlogin popipopipopipopipopi.";
        return new ModelAndView("oauthloginPage", "message", message);
    }
}