package com.jcmn.springcourse2.learn_jpa_and_hibernate.coursejdbc;

import com.jcmn.springcourse2.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// Repository, as it talks to a DB
@Repository
public class CourseJdbcRepository {

    // To fire JDBC template!
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY = """
            insert into course(id, name, author)
            values(?, ?, ?);
            """;

    private static String DELETE_QUERY = """
            delete from course
            where id = ?;
            """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(Course course){
        springJdbcTemplate.update(DELETE_QUERY, course.getId());
    }

}
