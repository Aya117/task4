package edu.cs.birzeit.task4_bookstore.model;

import java.util.ArrayList;
import java.util.List;

class BookDA  implements iIBookDA{
    private ArrayList<Book> Books =new ArrayList<>();

    public BookDA(){
    Books.add(new Book(150,"think of java","java"));
        Books.add(new Book(300,"life in moon","moon"));
        Books.add(new Book(500,"my friend","frindship"));
    }
    public List<Book> getBooks(String cat){

      ArrayList<Book> data = new ArrayList<>();
      for (Book b : Books) {
          if (b.getCatigory().equals(cat)) {
             data.add(b);
          }
       }
       return data;
      }

    public String[] getCategories() {
        String[] cats = new String[]{"Java", "moon", "frindship"};

        return cats;
    }
}
