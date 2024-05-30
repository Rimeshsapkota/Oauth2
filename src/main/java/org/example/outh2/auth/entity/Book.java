package org.example.outh2.auth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer bookId;
  private String bookName;

  public Book(Integer bookId, String bookName) {
    this.bookId = bookId;
    this.bookName = bookName;
  }

  public Book() {
  }

  public Book(String bookName) {
    this.bookName=bookName;
  }
}
