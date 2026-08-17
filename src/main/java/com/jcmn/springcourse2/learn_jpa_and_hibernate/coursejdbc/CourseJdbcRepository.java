package com.jcmn.springcourse2.learn_jpa_and_hibernate.coursejdbc;

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
            values(1, 'Learn AWS', 'In28Minutes');
            """;

    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }

}
