package org.example.outh2.auth.controller;


import lombok.RequiredArgsConstructor;
import org.example.outh2.auth.dto.SignUpRequest;
import org.example.outh2.auth.dto.SigninRequest;
import org.example.outh2.auth.entity.Book;
import org.example.outh2.auth.service.AuthenticationService;
import org.example.outh2.shared.ApiResponse;
import org.example.outh2.shared.ApiURL;
import org.example.outh2.shared.JwtResponse;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {

  private final AuthenticationService authenticationService;

  @PostMapping(ApiURL.USER_SIGN_UP)
  public ApiResponse userSignup(@RequestBody @Validated SignUpRequest request) {
    return authenticationService.signup(request);
  }

  @PostMapping(value = ApiURL.USER_SIGN_IN, produces = MediaType.APPLICATION_JSON_VALUE)
  public JwtResponse signin(@RequestBody SigninRequest request) {
    return authenticationService.signin(request);
  }


}
