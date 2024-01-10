/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author samih
 */
public class OgretmenInheritance extends Kisi{
    private int teacherID;
    private double score;

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        super.girisYap(kullaniciAdi, sifre);
        System.out.println("Öğretmen Giriş Yaptı.");
    }

    public void ogrencileriListele(){
        System.out.println("Öğrenciler Listelendi");
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
}
