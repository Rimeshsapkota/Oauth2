package org.example.outh2.auth.controller;

import lombok.RequiredArgsConstructor;
import org.example.outh2.auth.entity.Book;
import org.example.outh2.auth.service.BookServiceImpl;
import org.example.outh2.shared.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BookController {
  private final BookServiceImpl bookService;

  @PostMapping("/add_book")
  public ApiResponse userAddBook(@RequestBody Book book) {
    bookService.userAddBook(book);
    return new ApiResponse("successfully add book");
  }

  @GetMapping("/get_all_book")
  public List<Book> getAllBook() {
    return bookService.getAllBook();
  }
}
