/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author samih
 */
public class Abstract {
    public static void main(String[] args) {
        //KisiAbstract kisi = new KisiAbstract(); Abstract olduğu için hata veriyor !!
        OgretmenAbstract ogretmen = new OgretmenAbstract();
        OgrenciAbstract ogrenci = new OgrenciAbstract();
        
        ogretmen.girisYap("öğretmen", "");
        ogretmen.kayitOl();
        
        ogrenci.girisYap("öğretmen", "");
        ogrenci.kayitOl();
        
        
    }
}
