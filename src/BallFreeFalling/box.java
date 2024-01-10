/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BallFreeFalling;

/**
 *
 * @author samih
 */
public class box {
    private static int bx = 0;
    private int boxNo =0;
    private int counter;

    public box() {
        this.counter = 0;
        this.bx++;
        this.boxNo = box.bx;
    }

    @Override
    public String toString() {
        return "box{" + "boxNo=" + boxNo + ", counter=" + counter + '}';
    }

    public int getBoxNo() {
        return boxNo;
    }

    public void setBoxNo(int boxNo) {
        this.boxNo = boxNo;
    }

    public int getCounter() {
        return counter;
    }

    public void addBall() {
        this.counter++;
        System.out.println(this.counter);
    }
}
