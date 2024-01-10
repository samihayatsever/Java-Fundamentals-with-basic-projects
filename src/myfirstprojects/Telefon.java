/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstprojects;

/**
 *
 * @author samih
 */
public class Telefon {
    public String marka = "IPhone";
    public String model = "8plus";
    public int UretimYili = 2016;
    public double ekranBoyutu = 5.8;
    
    public void aramaYap(int numara){
        System.out.println("Arama Yapılıyor..");
    }
    public void aramaKabulEt(boolean agree){
        agree = (agree != true && agree != false) ? true : agree;
        if(agree) System.out.println("Arama Kabul Edildi..");
    }
}
