package com.jcmn.springcourse2.learn_jpa_and_hibernate.coursejdbc;

import com.jcmn.springcourse2.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
//public class CourseJdbcCommandLineRunner implements CommandLineRunner {
//
//    @Autowired
//    private CourseJdbcRepository repository;
//
//    // Interface used to indicate that Bean should run when it is contained inside Spring App
//    @Override
//    public void run(String... args) throws Exception {
//        Course test = new Course(3, "Learn Automation", "Jose");
//        Course test2 = new Course(2, "Learn Spring", "JCMN");
//
//        repository.insert(new Course(1, "Learn AWS", "Gianmarcos"));
//        repository.insert(test2);
//        repository.insert(test);
//
//        repository.delete(test);
//
//        System.out.println(repository.findById(test2));
//
//    }
//}
