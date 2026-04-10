package com.example.JavaSpringBoot.controller;


import com.example.JavaSpringBoot.util.JwtUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil=new JwtUtil();
    @PostMapping("/getToken")
    public String getToken(@RequestParam String username,@RequestParam String password){
        if("admin".equals(username) && "password".equals(password)){
            return jwtUtil.generateToken(username);
        }
        return "Invalid User";
    }
}
