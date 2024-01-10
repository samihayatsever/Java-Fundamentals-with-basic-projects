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

public class ballFreeFalling{
    
    public static void main(String[] args) {
        
        playGround pg = new playGround(10);
        int BlcNo;
        
        int n = 10000; // Number of threads or ball
        for (int i = 0; i < n; i++) {
            MultiThreading object
                = new MultiThreading();
            object.run(pg);
        }
        
        pg.displayBoxes();
        
    }
}
