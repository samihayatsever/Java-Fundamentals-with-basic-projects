/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryAF;

/**
 *
 * @author samih
 */
public class LibraryAF {
    public static void main(String[] args) {
        
        Book book1 = new Book("Okçunun yolu", "Paulo C.", "2022", "123456", true);
        
        BookOperations bookOp = new BookOperations(book1);
        bookOp.AddBook(book1);
        bookOp.DeleteBook(book1);
        bookOp.UpdateBook(book1);
        bookOp.SearchBook(book1);
        
        User user1 = new User("sami", "hayatsever", "5391112233");
        
        UserOperations userOp = new UserOperations(user1);
        userOp.Register(user1);
        userOp.UpdateMyInfo(user1);
        
        BorrowOperations borrowOp = new BorrowOperations(user1, book1);
        borrowOp.BorrowBook(user1, book1);
        borrowOp.ReturnBook(user1, book1);
    }
}
