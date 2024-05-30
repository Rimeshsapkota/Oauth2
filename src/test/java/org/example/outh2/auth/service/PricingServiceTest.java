package org.example.outh2.auth.service;

import jakarta.annotation.security.RunAs;
import org.example.outh2.auth.entity.Book;
import org.example.outh2.auth.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
@ActiveProfiles("test") //Register the Mockito junit jupiter extension
class PricingServiceTest {
  @Mock
  private ProductVerifier productVerifier;

  @InjectMocks
  private BookServiceImpl bookService;

  @MockBean
  private BookRepository repository;

  @Test
  void shouldReturnCheapPriceWhenProductInTheStock() {
    when(productVerifier.isCurrentlyInStockOfCompetitor("Mackbook")).thenReturn(true);
    PricingService pricingService = new PricingService(productVerifier);
    assertEquals(pricingService.calculatePrice("Mackbook"), new BigDecimal("99.99"));
  }

  @Test
   void getAllBook() {
    Book book1 = new Book(1, "Social");
    Book book2 = new Book(2, "Science");
    List<Book> bookList = Arrays.asList(book1, book2);
    when(repository.findAll()).thenReturn(bookList);
    List<Book> result = bookService.getAllBook();
    assertEquals(2, result.size());
    assertEquals("Social", result.get(0).getBookName());
    assertEquals("Science", result.get(1).getBookName());
  }

}