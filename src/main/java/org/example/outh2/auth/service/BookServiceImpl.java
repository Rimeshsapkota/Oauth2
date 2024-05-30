package org.example.outh2.auth.service;

import lombok.RequiredArgsConstructor;
import org.example.outh2.auth.entity.Book;
import org.example.outh2.auth.repository.BookRepository;
import org.springframework.stereotype.Service;

import javax.management.Query;
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

  public Book getBook(Integer bookId) {
    Book book = bookRepository.findById(bookId).orElse(null);
    if (book != null) {
      return book;
    }
    return new Book();
  }

  public String sum() {
    return "sfsdf";
  }

  public String divide() {
    return "divide";
  }
}
