/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author samih
 */
public class DiziYazdir <Type> {// or T yaygın kullanımdır.
    public void yazdir(Type[] dizi){
        for(Type eleman : dizi)
        {
            System.out.println(eleman);
        }
    }
}
