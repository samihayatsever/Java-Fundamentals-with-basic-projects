/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileReadWriteOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samih
 */
public class DosyayaYazmak {
    public static void main(String[] args) {
        /*
        FileWriter writer = null;
        try {
            writer = new FileWriter("dosya.txt", true);
            writer.write("Sami Hayatsever\n");
            writer.write("Melih Hayatsever\n");
        } catch (IOException ex) {
            System.out.println("Dosya oluşturulurken bir hata oluştu.");
        } finally{
            if(writer != null)
                try {
                    writer.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu.");
            }
        }
        */
        
        //Yazma (FileWriter)
        try(FileWriter writer = new FileWriter("dosya.txt", true)){ // Disposable objects, kapatılabilir nesneler için
            writer.write("-------------------------\n");
            writer.write("Sami Hayatsever\n");
            writer.write("Melih Hayatsever\n");
            writer.write("Semih Hayatsever\n");
        } catch (IOException ex) {
            System.out.println("Dosya oluşturulurken bir hata oluştu.");
        }
        
        
        // Okuma (FileReader)
        try(Scanner input = new Scanner(new FileReader("dosya.txt"))){
            
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
            
        } catch (IOException ex) {
            System.out.println("Dosya okunurken bir hata oluştu.");
        }
        
        
        // Yazma (BufferedWriter), diğerinden farkı her satır için dosyaya gidip gelmek yerine bir buffera veriyi çekiyor ve bize oradan veriyi veriyor. Performans farkı yaratabiliyor.
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("dosya.txt", true))){
            writer.write("-------------------------\n");
            writer.write("Hayatsever Sami\n");
            writer.write("Hayatsever Semih\n");
            writer.write("Hayatsever Melih\n");
        } catch (IOException ex) {
            System.out.println("Dosyaya Yazılırken Hata Oluştu.");
        }
        
        // Okuma
        try(Scanner input = new Scanner(new BufferedReader(new FileReader("dosya.txt")))){
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        } catch (IOException ex) {
            System.out.println("Dosya Okunurken Hata Oluştu.");
        }
    }
}
