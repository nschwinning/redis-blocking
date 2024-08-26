package com.example.redisblocking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@RedisHash("Student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student implements Serializable {

    @Id
    private String id;
    @Indexed
    private String name;
    private int grade;

}
