package com.example.redisblocking;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {

    Optional<Student> findByName(String name);

}
