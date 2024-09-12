package edu.misena.senaviewer.model;

import java.util.List;

public class Book extends Publication {
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, String editionDate, String editorial, String isbn) {
        super(title, editionDate, editorial);
        this.isbn = isbn;
        this.readed = false;
        this.timeReaded = 0;
    }


    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }
    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }
    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        return super.toString() + ", ISBN: " + isbn + ", Readed: " + readed + ", Time Readed: " + timeReaded + " mins";
    }
}
