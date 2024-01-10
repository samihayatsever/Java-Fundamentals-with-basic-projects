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
public class ball {
    private static int ballNo = 0;

    public static int getBallNo() {
        return ballNo;
    }

    public static void setBallNo(int ballNo) {
        ball.ballNo = ballNo;
    }
    
    public int fall(ArrayList<row> rows){
        int BlockNo = 1;
        for(row r : rows){
            //if(r.getRowNo() == 1) { BlockNo = r.getBlocks().get(BlockNo).chooseSide(); }
            BlockNo = r.getBlocks().get(BlockNo - 1).chooseSide();
        }return BlockNo;
    }
}
