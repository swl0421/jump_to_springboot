package com.mysite.sbb;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        Question q1 = new Question();
        q1.setSubject("What is SBB?");
        q1.setContent("I want to know about SBB.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("I have question about Spring Boot Model.");
        q2.setContent("Does ID generated automatically?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);
    }

}
