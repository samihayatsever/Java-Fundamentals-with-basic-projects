/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructors;

/**
 *
 * @author samih
 */
public class OgrenciConstructor {
    private String name;
    private String surname;
    private int schoolID;
    private int birthYear;

    
    public OgrenciConstructor(){ // Constructor budur, bu method bu nessne her oluşturulduğunda çalışır.
        System.out.println("Constructor method running..");
        this.name = "Sami";
        this.surname = "Hayatsever";
        this.schoolID = 123654;
        this.birthYear = 1994;
    }
    
    public OgrenciConstructor(String name, String surname){ // parametreli Constructor overloading 
        System.out.println("Constructor method running..");
        this.name = name;
        this.surname = surname;
        this.schoolID = 123654;
        this.birthYear = 1994;
    }

    @Override
    public String toString() {
        return "OgrenciConstructor{" + "name=" + name + ", surname=" + surname + ", schoolID=" + schoolID + ", birthYear=" + birthYear + '}';
    }
    
    
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

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
