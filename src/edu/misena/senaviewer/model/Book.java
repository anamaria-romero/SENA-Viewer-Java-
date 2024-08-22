package edu.misena.senaviewer.model;

import java.util.List;
import java.util.Scanner;

public class Book {
    int id;
    String title;
    String editionDate;
    String editorial;
    List<String> authors;
    String isbn;
    boolean readed;
    int timeReaded;


    public Book(String title, String editionDate, String editorial, String isbn) {
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


    public String getEditionDate() {
        return editionDate;
    }
    public void setEditionDate(String editionDate) {
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


    public static Book addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el titulo del libro: ");
        String title = scanner.nextLine();

        System.out.print("Ingresa la fecha: ");
        String editionDate = scanner.nextLine();

        System.out.print("Ingresa la editorial: ");
        String editorial = scanner.nextLine();

        System.out.print("Ingresa el ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("El libro ha sido agregado.");
        return new Book(title, editionDate,  editorial, isbn);
    }
}
