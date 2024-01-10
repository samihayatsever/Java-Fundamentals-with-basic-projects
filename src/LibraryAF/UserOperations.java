/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryAF;

/**
 *
 * @author samih
 */
public class UserOperations {
    public User user;

    public UserOperations(User user) {
        this.user = user;
    }
    
    public void Register(User user){
        System.out.println("Üye Olundu." + user.getName());
    }
    
    public void UpdateMyInfo(User user){
        System.out.println("Bilgiler Güncellendi." + user);
    }
}
