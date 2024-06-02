package org.example.outh2.auth.service;

import org.example.outh2.auth.repository.BookRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceImplTest {
  @Autowired
  private BookServiceImpl bookService;

  @MockBean
  private BookRepository repository;


}