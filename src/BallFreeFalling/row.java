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
public class row {
    private static int counter = 0;
    private int rowNo = 0;
    private ArrayList<block> blocks = new ArrayList<block>();

    public row() {
        this.counter++;
        this.rowNo = this.counter;
        block.setCounter(0);
        for (int i = 0; i < this.rowNo; i++) {
            blocks.add(new block());
        }
    }

    @Override
    public String toString() {
        return "row{" + "rowNo=" + rowNo + ", blocks=" + blocks + '}';
    }

    public ArrayList<block> getBlocks() {
        return blocks;
    }

}
