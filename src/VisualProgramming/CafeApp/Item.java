/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisualProgramming.CafeApp;

import java.util.ArrayList;

/**
 *
 * @author samih
 */
public class Item {
    private static int ItemNo = 0;
    private Name name;
    private double price;
    private Size size;
    private int count;

    
    public Item(Name name, double price) {
        this.ItemNo += 1;
        this.name = name;
        this.price = price;
        this.count = 0;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + ", size=" + size + ", count=" + count + '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public int getItemNo() {
        return ItemNo;
    }

    public void setItemNo(int ItemNo) {
        this.ItemNo = ItemNo;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    public ArrayList<String> itemNames(){
        ArrayList<String> names = new ArrayList<String>();
        for(Name name : Name.values()){
            names.add(name.toString());
        }
        return names;
    }
    
    public boolean increaseCount(){
        if(this.count < 10){
            this.count++;
            return true;
        }return false;
    }
    
    public boolean decreaseCount(){
        if(this.count > 0){
            this.count--;
            return true;
        }return false;
    }
    
}

enum Size {
    SHORT,
    LONG
}

enum Name {
    COFFEE,
    TEA,
    WATER,
    MINERALWATER
}
