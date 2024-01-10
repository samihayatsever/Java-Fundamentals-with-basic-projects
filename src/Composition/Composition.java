/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composition;

/**
 *
 * @author samih
 */
public class Composition {
    public static void main(String[] args) {
        OgrenciComposition ogrenci = new OgrenciComposition("sami", "hayatsever", "29", "99");
        
        OgrenciIslemleriComposition ogrIslemleri = new OgrenciIslemleriComposition(ogrenci);
        ogrIslemleri.OgrenciEkle();
        ogrIslemleri.OGrenciSil();
    }
}
