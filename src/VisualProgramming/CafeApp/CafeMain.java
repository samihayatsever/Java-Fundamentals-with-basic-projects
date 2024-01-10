/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisualProgramming.CafeApp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samih
 */
public class CafeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        ArrayList<Item> items = new ArrayList<Item>();
        
        items.add(new Item(Name.TEA, 20.0));
        items.add(new Item(Name.COFFEE, 50.0));
        items.add(new Item(Name.WATER, 10.0));
        items.add(new Item(Name.MINERALWATER, 35.0));
        
        
        ArrayList<Order> orders = new ArrayList<Order>();
        //orders.add(new Order());
        
        
        
        System.out.println("Hoşgeldiniz..");
        Table eskisehir = new Table(TableNumbers.Eskisehir, true);
        
        System.out.println("Masanızın İsmi: " + eskisehir.getTableNo());
        
        
        System.out.println("Ne İçmek İstersiniz?");
        System.out.println("1) ÇAY");
        System.out.println("2) KAHVE");
        System.out.println("3) SU");
        System.out.println("4) SODA");
        System.out.println("ÇIKIŞ İÇİN 'e' giriniz..");
        
        String secim = "";
        Order order1 = new Order();
        while(true){
            System.out.print("Seçiniz..  : ");
            secim = input.nextLine();
            if(secim.equals("e")){ break;}
            
            //Order order = new Order();
                switch(secim){
                    case "1":
                        order1.addItem(items.get(0));
                        break;
                    case "2":
                        order1.addItem(items.get(1));
                        break;
                    case "3":
                        order1.addItem(items.get(2));
                        break;
                    case "4":
                        order1.addItem(items.get(3));
                        break;
                    default:
                        break;
                }
        }
        eskisehir.addOrder(order1);
        
        Order order2 = new Order();
        while(true){ // Sipariş 2 deneme silinecek
            System.out.print("Seçiniz..  : ");
            secim = input.nextLine();
            if(secim.equals("e")){ break;}
            
            //Order order = new Order();
                switch(secim){
                    case "1":
                        order2.addItem(items.get(0));
                        break;
                    case "2":
                        order2.addItem(items.get(1));
                        break;
                    case "3":
                        order2.addItem(items.get(2));
                        break;
                    case "4":
                        order2.addItem(items.get(3));
                        break;
                    default:
                        break;
                }
        }
        eskisehir.addOrder(order2);
        
        double TotalPrice = 0;
        for (Order odr : eskisehir.getOrders()) {
            double orderPrice = odr.getTotalOrderPrice(odr);
            TotalPrice += orderPrice;
            System.out.println("Toplam Sipariş Tutarı: " + orderPrice);
        }
        System.out.println("Toplam Tutar: " + TotalPrice);
        
        
    }
}
