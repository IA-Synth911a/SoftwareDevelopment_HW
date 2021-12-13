/**
 * Comment
 */

package com.example.demo.service;

import com.example.demo.database.Sql2oDbHandler;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestParam;
import org.sql2o.Connection;

import java.util.List;

@Service
public class ProductService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public ProductService() {

  }

  public List<Product> getProducts() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select ID id, NAME name, IMAGE_URL imageUrl, DESCRIPTION description, BOOK_ID bookId"
          + " from PRODUCTS";

        return connection.createQuery(query).executeAndFetch(Product.class);
    }
  }

}