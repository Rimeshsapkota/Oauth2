package org.example.outh2.auth.repository;

import org.example.outh2.auth.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
