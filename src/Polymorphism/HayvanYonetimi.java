/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author samih
 */
public class HayvanYonetimi {
    public Hayvan hayvan;

    public HayvanYonetimi(Hayvan hayvan) {
        this.hayvan = hayvan;
    }
    
    public void sesVer(){
        hayvan.sesCikar();
    }
}
