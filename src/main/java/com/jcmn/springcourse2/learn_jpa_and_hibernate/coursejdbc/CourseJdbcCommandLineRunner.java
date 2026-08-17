package com.jcmn.springcourse2.learn_jpa_and_hibernate.coursejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    // Interface used to indicate that Bean should run when it is contained inside Spring App
    @Override
    public void run(String... args) throws Exception {
        repository.insert();
    }
}
