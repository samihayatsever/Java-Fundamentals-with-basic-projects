/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author samih
 */
public class OgrenciInheritance extends Kisi{
    private int schoolID;
    private int courseNumber;

    @Override
    public String toString() {
        return "OgrenciInheritance{" + "schoolID=" + schoolID + ", courseNumber=" + courseNumber + '}';
    }

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        super.girisYap(kullaniciAdi, sifre);
        System.out.println("Öğrenci Giriş Yaptı.");
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
}
