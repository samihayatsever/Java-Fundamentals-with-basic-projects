/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopFundamentals;

/**
 *
 * @author samih
 */
public class Kullanici {
    
    private String name = "Sami"; 
    private String surname = "HAYATSEVER";
    private int age = 29;
    private String email = "@gmail";
    
    
    protected void setSurname(String surname)
    {
        this.surname = surname;
    }
    
    public String getSurname()
    {
        return surname;
    }
    
    protected void setAge(int age)
    {
        if(age >= 18 && age < 100) this.age = age;
        else System.out.println("Yaşınız Uygun Aralıklarda Değil!");
    }
    
    @Override
    public String toString() {
        return "Kullanici{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", email=" + email + '}';
    }
    
}
