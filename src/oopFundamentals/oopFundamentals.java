/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopFundamentals;

import java.util.Scanner;

/**
 *
 * @author samih
 */
public class oopFundamentals {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /*
        Muhasebe muhasebe = new Muhasebe();
        muhasebe.paraYatir(500);
        muhasebe.paraCek(150);
        muhasebe.toplamParaGoster();
        */
        
        
        /*
        Kullanici kullanici = new Kullanici();
        //kullanici.name = "Sami";
        //kullanici.surname = "Hayatsever";
        System.out.println(kullanici.getSurname());
        kullanici.setSurname("Hayatsever");
        System.out.println(kullanici);
        */
        
        
        Ogrenci ogrenci = new Ogrenci();
        System.out.print("Öğrenci Adını Giriniz: ");
        ogrenci.setName(input.nextLine());
        System.out.print("Öğrenci Soyadını Giriniz: ");
        ogrenci.setSurname(input.nextLine());
        System.out.print("Öğrenci Okul numarasını Giriniz: ");
        ogrenci.setSchoolID(input.nextInt());
        System.out.print("Öğrenci Doğum Yılı Giriniz: ");
        ogrenci.setBirthDate(input.nextInt());
        
        System.out.println(ogrenci);
        
    }
}
