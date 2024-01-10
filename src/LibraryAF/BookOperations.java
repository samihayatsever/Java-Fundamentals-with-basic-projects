/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryAF;

/**
 *
 * @author samih
 */
public class BookOperations {
    public Book book;

    public BookOperations(Book book) {
        this.book = book;
    }
    
    public void AddBook(Book book){
        System.out.println("Yeni kitap eklendi" + book.getBookName());
    }
    
    public void DeleteBook(Book book){
        System.out.println("Kitap Siliniyor. " + book.getBookName());
    }
    
    public void UpdateBook(Book book){
        System.out.println("Kitap Bilgileri güncellendi. "  + book);
    }
    
    public void SearchBook(Book book){
        System.out.println("Kitap Aranıyor.."  + book.getBookName());
    }
}
