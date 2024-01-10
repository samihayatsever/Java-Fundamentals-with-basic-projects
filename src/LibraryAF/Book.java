/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryAF;

/**
 *
 * @author samih
 */
public class Book {
    private String bookName;
    private String author;
    private String pablicationDate;
    private String barcode;
    private boolean inStock;

    public Book(String bookName, String author, String pablicationDate, String barcode, boolean inStock) {
        this.bookName = bookName;
        this.author = author;
        this.pablicationDate = pablicationDate;
        this.barcode = barcode;
        this.inStock = inStock;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPablicationDate() {
        return pablicationDate;
    }

    public void setPablicationDate(String pablicationDate) {
        this.pablicationDate = pablicationDate;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", author=" + author + ", pablicationDate=" + pablicationDate + ", barcode=" + barcode + ", inStock=" + inStock + '}';
    }
}
