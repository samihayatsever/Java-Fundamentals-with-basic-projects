/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author samih
 */
public class Interface {
    public static void main(String[] args) {
        Student student = new Student();
        student.register();
        student.logIn("", "");
        student.sendMessage();
        student.enterExam();
        
        System.out.println("----------------------------");
        
        Teacher teacher = new Teacher();
        teacher.register();
        teacher.logIn("","");
        teacher.sendMessage();
        //teacher.enterExam(); // sınava giriş metodu öğretmen için implemente edilmediğinden kullanamaz.
        
        System.out.println("----------------------------");
        
        Manager manager = new Manager();
        manager.register();
        manager.logIn("", "");
        manager.sendMessage();
    }
}
