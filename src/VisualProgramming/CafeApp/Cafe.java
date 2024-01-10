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
public class Cafe {
    private String name;
    private ArrayList<Table> tables;
    public Table selectedTable;

    public Cafe() {
        this.tables = new ArrayList<Table>(10);
        this.selectedTable = null;
    }
    
    public void addTable(Table table){
        this.tables.add(table);
    }
    
    public ArrayList<Table> getTables(){
        return this.tables;
    }
    
    public void setTables(ArrayList<Table> tables){
        this.tables = tables;
    }
    
    public Table selectTable(String tableName){
        
        switch(tableName){
            case "Istanbul":
                if(tables.get(0).getIsFull() == false){
                    tables.get(0).setIsFull(true);
                    selectedTable=tables.get(0);
                }
                else
                    tables.get(0).setIsFull(false);
                break;
            case "Eskisehir":
                if(tables.get(1).getIsFull() == false){
                    tables.get(1).setIsFull(true);
                    selectedTable=tables.get(1);
                }
                else
                    tables.get(1).setIsFull(false);
                break;
            case "Izmir":
                if(tables.get(2).getIsFull() == false){
                    tables.get(2).setIsFull(true);
                    selectedTable=tables.get(2);
                }
                else
                    tables.get(2).setIsFull(false);
                break;
            case "Ankara":
                if(tables.get(3).getIsFull() == false){
                    tables.get(3).setIsFull(true);
                    selectedTable=tables.get(3);
                }
                else
                    tables.get(3).setIsFull(false);
                break;
            case "Bursa":
                if(tables.get(4).getIsFull() == false){
                    tables.get(4).setIsFull(true);
                    selectedTable=tables.get(4);
                }
                else
                    tables.get(4).setIsFull(false);
                break;
            case "Antalya":
                if(tables.get(5).getIsFull() == false){
                    tables.get(5).setIsFull(true);
                    selectedTable=tables.get(5);
                }
                else
                    tables.get(5).setIsFull(false);
                break;
            case "Adana":
                if(tables.get(6).getIsFull() == false){
                    tables.get(6).setIsFull(true);
                    selectedTable=tables.get(6);
                }
                else
                    tables.get(6).setIsFull(false);
                break;
            case "Erzurum":
                if(tables.get(7).getIsFull() == false){
                    tables.get(7).setIsFull(true);
                    selectedTable=tables.get(7);
                }
                else
                    tables.get(7).setIsFull(false);
                break;
            case "Zonguldak":
                if(tables.get(8).getIsFull() == false){
                    tables.get(8).setIsFull(true);
                    selectedTable=tables.get(8);
                }
                else
                    tables.get(8).setIsFull(false);
                break;
            case "Kars":
                if(tables.get(9).getIsFull() == false){
                    tables.get(9).setIsFull(true);
                    selectedTable=tables.get(9);
                }
                else
                    tables.get(9).setIsFull(false);
                break;
            default:
                break;
           
        }return selectedTable;
    }

    @Override
    public String toString() {
        return "Cafe{" + "name=" + name + ", tables=" + tables + ", selectedTable=" + selectedTable + '}';
    }
}
