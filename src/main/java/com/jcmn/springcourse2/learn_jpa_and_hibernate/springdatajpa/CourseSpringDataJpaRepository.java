package com.jcmn.springcourse2.learn_jpa_and_hibernate.springdatajpa;

import com.jcmn.springcourse2.learn_jpa_and_hibernate.course.Course;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
