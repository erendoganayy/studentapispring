package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
