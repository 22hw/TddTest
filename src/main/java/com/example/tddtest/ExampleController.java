package com.example.tddtest;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleController {

    @GetMapping("/throw")
    public void throwException() {
        throw new CustomException("고객 예외 발생");
    }
}
