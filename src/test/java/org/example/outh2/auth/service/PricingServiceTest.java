package org.example.outh2.auth.service;

import org.example.outh2.auth.entity.Book;
import org.example.outh2.auth.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

class PricingServiceTest {

  private final ProductVerifier productVerifier=new ProductVerifier();

  @InjectMocks
  private BookServiceImpl bookService;

  @Mock
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

  @Test
  void add() {
    assertEquals(2, productVerifier.add(1, 1));
  }
}