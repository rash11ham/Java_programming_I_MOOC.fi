/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Book {
    private String title;
    private int page;
    private int year;

    public Book(String title, int page, int year) {
        this.title = title;
        this.page = page;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }

    public int getYear() {
        return year;
    }
    
    
    
}
