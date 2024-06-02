package org.example.outh2.auth.service;

import lombok.RequiredArgsConstructor;
import org.example.outh2.auth.entity.Book;
import org.example.outh2.auth.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl {
  private final BookRepository bookRepository;

  public void userAddBook(Book book) {
    bookRepository.save(book);
  }

  public List<Book> getAllBook() {



    return bookRepository.findAll();
  }

}
