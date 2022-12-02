package com.personal.practice.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public String forgotPassword(String email);

    public String resetPassword(String token, String password);

}
