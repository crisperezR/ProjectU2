package org.example.project_u_2;

public class Book {
    private String bId;
    private String title;
    private String author;
    private String dateP;
    private String stock;
    private String disp;

    public Book(String bId, String title, String author, String dateP, String stock, String disp) {
        this.bId = bId;
        this.title = title;
        this.author = author;
        this.dateP = dateP;
        this.stock = stock;
        this.disp = disp;
    }

    public String getBId() {
        return bId;
    }

    public void setBId(String bId) {
        this.bId = bId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateP() {
        return dateP;
    }

    public void setDateP(String dateP) {
        this.dateP = dateP;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDisp() {
        return disp;
    }

    public void setDisp(String disp) {
        this.disp = disp;
    }
}
