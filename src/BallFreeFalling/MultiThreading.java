/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BallFreeFalling;

/**
 *
 * @author samih
 */
public class MultiThreading extends Thread{
    public void run(playGround pg)
    {
        try {
            int BlcNo;
            ball ball1 = new ball();
            BlcNo = ball1.fall(pg.getRows());
            pg.getBoxes().get(BlcNo - 1).addBall();
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
