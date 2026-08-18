package com.jcmn.springcourse2.learn_jpa_and_hibernate.jpa;

import com.jcmn.springcourse2.learn_jpa_and_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// Repository because it talks to a DB
@Repository
@Transactional
public class CourseJpaRepository {
    // We created an entity (Course), so we need an entity manager
    @PersistenceContext // More specific than autowired
    EntityManager entityManager;

    // We want to make the same requests as before with JBDC
//    repository.insert(test);
//    repository.delete(test);
//    System.out.println(repository.findById(test2));

    public void insert(Course course){
        entityManager.merge(course); // Insert. Easy, mapping automized.
    }

    public Course findById(Long id){
       return entityManager.find(Course.class, id); // Find
    }

    public void deleteById(Long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course); // Delete
    }

}
