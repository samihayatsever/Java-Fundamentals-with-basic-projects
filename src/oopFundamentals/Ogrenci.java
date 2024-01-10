/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopFundamentals;

/**
 *
 * @author samih
 */
public class Ogrenci {
    private String name;
    private String surname;
    private int schoolID;
    private int birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Lütfen Öğrenci Adını Giriniz!");
        }else this.name = name;
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
        if(Integer.toString(schoolID).length() == 11){
            this.schoolID = schoolID;
        }else System.out.println("Okul Numarası 11 Haneli olmalıdır!");
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        if(birthDate <= 2023){
            this.birthDate = birthDate;
        }else System.out.println("Ne Zaman Doğmayı Planlıyorsunuz");
    }

    @Override
    public String toString() {
        return "Ogrenci{" + "name=" + name + ", surname=" + surname + ", schoolID=" + schoolID + ", birthDate=" + birthDate + '}';
    }
    
    
}
