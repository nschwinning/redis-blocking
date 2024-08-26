package com.example.redisblocking;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class CustomRunner implements CommandLineRunner {



    private final StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        if (studentRepository.count() > 0) {
            return;
        }

        Student engStudent = new Student(
                "Eng2015001", "John", 1);
        Student medStudent = new Student(
                "Med2015001", "Gareth", 2);
        studentRepository.save(engStudent);
        studentRepository.save(medStudent);

        log.info("Students saved in Redis");

    }

}
