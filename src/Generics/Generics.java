/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author samih
 */
public class Generics {
    public static void main(String[] args) {
        Integer [] sayilar = {5,3,47,65,21};
        String[] metinler = {"sami", "melih", "semih", "hatice", "mustafa"};
        
        DiziYazdir <String> strYaz = new DiziYazdir <String>();
        DiziYazdir <Integer> intYaz = new DiziYazdir <Integer>();
        
        strYaz.yazdir(metinler);
        System.out.println("---------------------------");
        intYaz.yazdir(sayilar);
        
    }
}
