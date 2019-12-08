package com.veselov.alex.springin10steps.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
    @Autowired
    private JdbcConnection connection;

    public PersonDao() {
        System.out.println("PersonDao");
    }

    public JdbcConnection getConnection() {
        return connection;
    }

    public void setConnection(JdbcConnection connection) {
        this.connection = connection;
    }
}
