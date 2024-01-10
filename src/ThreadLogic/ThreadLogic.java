/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThreadLogic;

/**
 *
 * @author samih
 */
public class ThreadLogic {
    public static void main(String[] args) {
        
        for(int i = 0; i < 100; i++){
            System.out.print("A");
        }System.out.print("\n");
        
        for(int j = 0; j<100; j++){
            System.out.print("D");
        }System.out.println("\n İkisini sırası ile yazdı. Şimdi Threadları göreceğiz bunlar aynı anda işlemler iyapmamızı sağlar.");
        
        // Thread
        Thread thread1 = new Thread(){ // anonim class
            public void run(){
                for(int i = 0; i < 100; i++){
                    System.out.print("A");
                }System.out.print("\n");
            }
        };
        
        Thread thread2 = new Thread(){ // anonim class
            public void run(){
                for(int i = 0; i < 100; i++){
                    System.out.print("D");
                }System.out.print("\n");
            }
        };
        
        thread1.start();
        thread2.start();
        
        MyThread thread3 = new MyThread();
        thread3.start();
    }
}
