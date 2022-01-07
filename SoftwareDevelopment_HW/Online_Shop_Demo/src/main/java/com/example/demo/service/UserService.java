package com.example.demo.service;

import com.example.demo.database.Sql2oDbHandler;
import com.example.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private Sql2oDbHandler sql2oDbHandler;

    public UserService() {

    }

    public List<User> findByEmail(String keyword) {
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
          String query = "select ID id from USER where email like :keyword";

          return connection.createQuery(query)
              .addParameter("keyword", "%"+keyword+"%")
              .executeAndFetch(User.class);
        }
    }
}
