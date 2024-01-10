/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author samih
 */
public class Kisi {
    private String name;
    private String surname;
    private String userName;
    private String password;
    private int birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Kisi{" + "name=" + name + ", surname=" + surname + ", userName=" + userName + ", password=" + password + ", birthDate=" + birthDate + '}';
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void mesajGonder(){
        System.out.println("Mesaj Gönderildi");
    }
    
    public void girisYap(String kullaniciAdi, String sifre){
        if(kullaniciAdi.equals("Sami") && sifre.equals("123456"))
            System.out.println("Giriş Yapıldı.");
    }
}
