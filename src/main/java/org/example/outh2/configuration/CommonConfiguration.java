package org.example.outh2.configuration;


import org.example.outh2.shared.ApiResponse;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

@Configuration
public class CommonConfiguration {
  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }


  @Bean
  public ApiResponse getStatus() {
    return ApiResponse.builder()
            .message("Exception occured in bug reporting system")
            .build();
  }

}
