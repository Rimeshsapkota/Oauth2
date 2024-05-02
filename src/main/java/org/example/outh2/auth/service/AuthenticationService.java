package org.example.outh2.auth.service;


import org.example.outh2.auth.dto.ChangePasswordDto;
import org.example.outh2.auth.dto.ForgetPasswordDto;
import org.example.outh2.auth.dto.SignUpRequest;
import org.example.outh2.auth.dto.SigninRequest;
import org.example.outh2.shared.ApiResponse;
import org.example.outh2.shared.JwtResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthenticationService {

  ApiResponse signup(SignUpRequest request);

  JwtResponse signin(SigninRequest request);



}