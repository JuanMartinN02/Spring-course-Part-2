package com.jcmn.springcourse2.learn_jpa_and_hibernate.springdatajpa;

import com.jcmn.springcourse2.learn_jpa_and_hibernate.course.Course;
import com.jcmn.springcourse2.learn_jpa_and_hibernate.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    // Interface used to indicate that Bean should run when it is contained inside Spring App
    @Override
    public void run(String... args) throws Exception {
        Course test = new Course(3, "Learn Automation", "Jose");
        Course test1 = new Course(1, "Learn AWS", "JCMN");
        Course test2 = new Course(2, "Learn Spring", "JCMN");

        repository.save(test);
        repository.save(test1);
        repository.save(test2);

        System.out.println(repository.findById(test2.getId()));

        repository.deleteById(test2.getId());
        repository.delete(test);

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        // Using custom methods
        System.out.println(repository.findByAuthor("JCMN"));
        System.out.println(repository.findByAuthor("Alberto"));

        System.out.println(repository.findByName("Learn AWS"));
    }
}
