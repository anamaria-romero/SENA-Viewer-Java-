package edu.misena.senaviewer.model;

import java.util.List;
import java.util.Date;

public class Book {
    int id;
    String title;
    Date editionDate;
    String editorial;
    List<String> authors;
    String isbn;
    boolean readed;
    int timeReaded;


    public Book(String title, Date editionDate, String editorial, String isbn) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
        this.readed = false;
        this.timeReaded = 0;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public Date getEditionDate() {
        return editionDate;
    }
    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }


    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public List<String> getAuthors() {
        return authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }


    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public boolean isRead() {
        return readed;
    }
    public void setRead(boolean readed) {
        this.readed = readed;
    }


    public int getTimeRead() {
        return timeReaded;
    }
    public void setTimeRead(int timeRead) {
        this.timeReaded = timeRead;
    }
}
