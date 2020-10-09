package edu.cs.birzeit.task4_bookstore.model;

import java.util.List;

public interface iIBookDA {

    List<Book> getBooks(String cat);

    String[] getCategories();

}
