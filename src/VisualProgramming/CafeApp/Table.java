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
public class Table {
    private TableNumbers TableNo;
    private ArrayList<Order> Orders;

    public Table(TableNumbers TableNo, boolean isFull) {
        this.TableNo = TableNo;
        this.isFull = isFull;
        this.Orders = new ArrayList<Order>();
    }
    
    public Table() {
        this.TableNo = null;
        this.isFull = false;
        this.Orders = new ArrayList<Order>();
    }

    @Override
    public String toString() {
        return "Table{" + "TableNo=" + TableNo + ", Orders=" + Orders + ", isFull=" + isFull + '}';
    }
    
    public boolean getIsFull() {
        return isFull;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }
    private boolean isFull;

    public TableNumbers getTableNo() {
        return TableNo;
    }

    public void setTableNo(TableNumbers TableNo, Order Orders, boolean isFull) {
        this.TableNo = TableNo;
        this.isFull = isFull;
    }

    public ArrayList<Order> getOrders() {
        return Orders;
    }
    
    public void addOrder(Order order){
        Orders.add(order);
    }

    public void setOrders(ArrayList<Order> Orders) {
        this.Orders = Orders;
    }
}

enum TableNumbers{
    Istanbul,
    Eskisehir,
    Bursa,
    Izmir,
    Ankara,
    Antalya,
    Erzurum,
    Kars,
    Adana,
    Zonguldak
}
