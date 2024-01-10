/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author samih
 */
public class Inheritance {
    public static void main(String[] args) {
        OgrenciInheritance ogrenci = new OgrenciInheritance();
        ogrenci.girisYap("Sami", "123456");
        ogrenci.mesajGonder();
        System.out.println(ogrenci);
        
        OgretmenInheritance ogretmen = new OgretmenInheritance();
        ogretmen.girisYap("Sami", "123456");
        ogretmen.mesajGonder();
        System.out.println(ogretmen);
        ogretmen.ogrencileriListele();
    }
}
