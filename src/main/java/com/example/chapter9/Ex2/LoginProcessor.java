package com.example.chapter9.Ex2;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private final LoginUserManagementService loginUserManagementService;
    private final LoginCountService loginCountService;
private String username;
private String password;

    public LoginProcessor(LoginUserManagementService loginUserManagementService,LoginCountService loginCountService) {
        this.loginUserManagementService = loginUserManagementService;
        this.loginCountService=loginCountService;
    }


    public boolean login(){loginCountService.increment();
        String username=this.getUsername();
        String password=this.getPassword();
        boolean loginResult=false;
        if ("n".equals(username) && "n".equals(password)) {
            loginResult=true;
            loginUserManagementService.setUsername(username);
        } return loginResult;
} public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }}
