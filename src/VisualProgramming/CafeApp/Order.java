/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisualProgramming.CafeApp;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author samih
 */
public class Order {
    private static int Counter = 0;
    private int OrderNo = 0;
    private ArrayList<Item> items;

    public Order() {
        this.Counter += 1;
        this.OrderNo += Counter;
        this.items = new ArrayList<Item>();
    }

    @Override
    public String toString() {
        return "Order{" + "OrderNo=" + OrderNo + ", items=" + items + '}';
    }

    public int getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(int OrderNo) {
        this.OrderNo = OrderNo;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
    
    public void removeItem(Item item) {
        item.decreaseCount();
        
        /*
        if(this.items.size() > 0)
            this.items.remove(this.items.lastIndexOf(item));
        */
    }
    
    public double getTotalOrderPrice(Order order){
        double TotalPrice = 0;
        int counter = 0;
        
        for(Item item : order.getItems()){
            TotalPrice += item.getPrice() * item.getCount();
        }
        System.out.println(order);
        return TotalPrice;
    }
}
