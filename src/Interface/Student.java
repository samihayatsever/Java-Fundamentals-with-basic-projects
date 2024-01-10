/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author samih
 */
public class Student implements IUser{

    @Override
    public void logIn(String username, String password) {
        System.out.println("Öğrenci Giriş Yaptı.");
    }

    @Override
    public void register() {
        System.out.println("Öğrenci Kayıt Oldu.");
    }

    @Override
    public void sendMessage() {
        System.out.println("Öğrenci Mesaj Gönderdi.");
    }
    
    public void enterExam(){
        System.out.println("Sınava Girildi.");
    }
}
