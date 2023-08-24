package com.example.tddtest;
import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //fetch 속성을 FetchType.LAZY로 설정하면 지연 로딩이 활성화되며, FetchType.EAGER로 설정하면 즉시 로딩이 활성화된다.
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Course> courses;

    // Getter, Setter, Constructors...
}
