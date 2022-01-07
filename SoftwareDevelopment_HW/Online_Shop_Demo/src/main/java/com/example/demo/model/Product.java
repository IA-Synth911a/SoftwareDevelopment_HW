/**
 * Comment
 */

package com.example.demo.model;

public class Product {

  private long id;
  private String name;
  private String imageUrl;
  private String description;
  private String bookId;

  public Product() {
  }

  public Product(long id, String name, String imageUrl, String description, String bookId) {
    this.id = id;
    this.name = name;
    this.imageUrl = imageUrl;
    this.description = description;
    this.bookId = bookId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getBookId() {
    return bookId;
  }

  public void setPrice(String bookId) {
    this.bookId = bookId;
  }
}