package com.example.tddtest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // 추가적인 메서드 정의 가능
}
