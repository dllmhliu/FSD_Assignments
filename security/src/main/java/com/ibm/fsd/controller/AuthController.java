package com.ibm.fsd.controller;

import com.ibm.fsd.dto.TUser;
import com.ibm.fsd.dto.UserInfoDto;
import com.ibm.fsd.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @Autowired
    private AuthService authService;


    @PostMapping("/register")
    public void register(@RequestBody TUser registerUser) {
        authService.register(registerUser);
    }

    @PostMapping("/checkToken")
    public UserInfoDto checkToken(String token) {
        return authService.checkToken(token);
    }
}
