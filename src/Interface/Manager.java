/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author samih
 */
public class Manager implements IUser{

    @Override
    public void logIn(String username, String password) {
        System.out.println("Yönetici Giriş Yaptı.");
    }

    @Override
    public void register() {
        System.out.println("Yönetici Kayıt Oldu.");
    }

    @Override
    public void sendMessage() {
        System.out.println("Yönetici Mesaj Gönderdi.");
    }
    
}
