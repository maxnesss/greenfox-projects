package com.example.student.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(1L,"Max","max@gmail.com", LocalDate.of(1989,3, 7),34));
    }
}
