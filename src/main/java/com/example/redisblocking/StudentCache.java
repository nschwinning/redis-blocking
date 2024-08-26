package com.example.redisblocking;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

//@Component
public class StudentCache {

    private Random random = new Random();

    @Cacheable("students")
    public Student getStudent(String name) {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Student(UUID.randomUUID().toString(), name, random.nextInt(1, 11));
    }

    @CachePut("students")
    public Student updateStudent(String name) {
        return new Student(UUID.randomUUID().toString(), name, random.nextInt(1, 11));
    }

    @CacheEvict("students")
    public void evictStudent(String name) {
    }

}
