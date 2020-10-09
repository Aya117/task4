package edu.cs.birzeit.task4_bookstore.model;

public class Book {
    private int pages;
    private String title;
    private String catigory;

    public Book(int pages, String title, String catigory) {
        this.pages = pages;
        this.title = title;
        this.catigory = catigory;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getCatigory() {
        return catigory;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCatigory(String catigory) {
        this.catigory = catigory;
    }
}
