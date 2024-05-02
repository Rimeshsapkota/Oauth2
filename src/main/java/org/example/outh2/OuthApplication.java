package org.example.outh2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class OuthApplication {

  public static void main(String[] args) {
    SpringApplication.run(OuthApplication.class, args);
  }

}
