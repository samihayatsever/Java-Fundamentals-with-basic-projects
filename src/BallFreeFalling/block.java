/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BallFreeFalling;

import java.util.Random;

/**
 *
 * @author samih
 */
public class block {
    Random rand = new Random();
    private static int counter = 0;
    private int blockNo = 0;

    public block() {
        this.counter++;
        this.blockNo = block.counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        block.counter = counter;
    }

    public int getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(int blockNo) {
        this.blockNo = blockNo;
    }

    public int chooseSide(){
        int n = rand.nextInt(2);
        if(n == 0){
            System.out.println("Left!");
            return this.blockNo;
        }else if(n == 1){
            System.out.println("Right!");
            return this.blockNo + 1;
        }else return -1;
    }
    
}
