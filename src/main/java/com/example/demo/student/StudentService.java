package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(1L,
                        "eren",
                        "erendoganay60@hotmail.com",
                        LocalDate.of(1997, Month.DECEMBER,14),
                        23
                )
        );

    }
}
