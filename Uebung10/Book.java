package Uebung10;

public class Book extends Medium{
    private String author;
    private int pages;



public Book(String author, int pages, String title, int year){
    super(author,pages);
    this.author = author;
    this.pages = pages;
    }


@Override
public void printInfo(){
    System.out.println("Author: " + this.author);
    System.out.println("Pages: " + this.pages);
    System.out.println("Title: " + getTitle());
    System.out.println("Year: " + getYear());
}



}



