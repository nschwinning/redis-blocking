package com.example.redisblocking;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;
    //private final StudentCache studentCache;

    /*
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }
     */

    @GetMapping("/students/{name}")
    public Student getStudent(@PathVariable String name) {
        return studentRepository.findByName(name).orElse(null);
    }

}
