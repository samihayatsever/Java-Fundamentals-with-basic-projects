/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composition;

/**
 *
 * @author samih
 */
public class OgrenciIslemleriComposition {
    public OgrenciComposition ogrenci;

    public OgrenciIslemleriComposition(OgrenciComposition ogrenci) {
        this.ogrenci = ogrenci;
    }
    
    public void OgrenciEkle(){
        System.out.println("Eklendi. " + ogrenci);
    }
    
    public void OGrenciSil(){
        System.out.println("Silindi.");
    }
}
