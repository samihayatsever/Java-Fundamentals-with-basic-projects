/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BallFreeFalling;

import java.util.ArrayList;

/**
 *
 * @author samih
 */
public class playGround {
    private ArrayList<row> rows = new ArrayList<row>();
    private ArrayList<box> boxes = new ArrayList<box>();

    public ArrayList<box> getBoxes() {
        return boxes;
    }

    public ArrayList<row> getRows() {
        return rows;
    }

    public playGround(int number) {
        for (int i = 0; i < number; i++) { // istenen sayıda kutu oluşturulması
            boxes.add(new box());
            
            if(i != number - 1){ // istenen sayıya uygun satır oluşturulması
                rows.add(new row());
            }
        }
        System.out.println(boxes);
        System.out.println(rows);
    }
    public void displayBoxes(){
        System.out.println(boxes);
    }
    
}
