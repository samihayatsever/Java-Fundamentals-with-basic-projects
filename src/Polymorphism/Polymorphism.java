/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author samih
 */
public class Polymorphism {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        Hayvan hayvan1 = new Kopek();
        Kopek kopek = new Kopek();
        Kedi kedi = new Kedi();
        
        hayvan.sesCikar();
        hayvan1.sesCikar(); // köpek methodu çalıştı. Polymorphism
        kopek.sesCikar();
        
        System.out.println(hayvan.hayvanAd);
        System.out.println(hayvan1.hayvanAd); // tanımlamadan dolayı Köpek methodlarını alırken Hayvan attribute(özelliklerini) aldı. Polymorphism
        System.out.println(kopek.hayvanAd);
        System.out.println(kopek.kopekAd);
        
        System.out.println("---------------------------------");
        
        HayvanYonetimi hayYon = new HayvanYonetimi(kopek); // işte bu polymorphism hayvan paremetresi alan bir constructor'a hayvanı extend eden tüm subclasslar paremetre olarak verilebiliyor. Bu çok biçimli hale getirmiş oluyor.
        HayvanYonetimi hayYon1 = new HayvanYonetimi(kedi);
        HayvanYonetimi hayYon2 = new HayvanYonetimi(hayvan);
        HayvanYonetimi hayYon3 = new HayvanYonetimi(hayvan1);
        
        hayYon.sesVer();
        hayYon1.sesVer();
        hayYon2.sesVer();
        hayYon3.sesVer();
        
    }
}
