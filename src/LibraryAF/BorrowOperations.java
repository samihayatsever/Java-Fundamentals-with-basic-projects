/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryAF;

/**
 *
 * @author samih
 */
public class BorrowOperations {
    public User user;
    public Book book;

    public BorrowOperations(User user, Book book) {
        this.user = user;
        this.book = book;
    }
    
    public void BorrowBook(User user, Book book){
        System.out.println("Merhaba " + user.getName() + ", Kitap: " + book + " ödünç alındı.");
    }
    
    public void ReturnBook(User user, Book book){
        System.out.println("Merhaba " + user.getName() + ", Kitap: " + book + " teslim alındı.");
    }
}
