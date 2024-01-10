/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstprojects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import oopFundamentals.Kullanici;

/**
 *
 * @author samih
 */
public class MyFirstProjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        /* Klavyeden girilen 2 sayının toplamı
        int sayi3 = input.nextInt();
        int sayi4 = input.nextInt();
        System.out.println("Klavyeden Girilen Toplam: " + (sayi3 + sayi4));
        */
        
        /* Klavyeden girilen yarıçapa göre çemberin çevresini ekrana yazan program
        System.out.print("Yarıçapı Giriniz: ");
        double radius = input.nextDouble();
        System.out.println("Çemberin Çevresi: " + (2 * 3.14 * radius));
        */
        
        /* Dictionary'de fiyat listesi barındıran, kilogramı girilen meyvelerin toplam tutarını ekrana yazan program
        Dictionary<String, Integer> dict = new Hashtable<>();
        dict.put("elma", 5);
        dict.put("armut", 10);
        dict.put("portakal", 15);
        
        System.out.print("Kaç Kilo elma istersiniz?");
        double elmaKG = input.nextDouble();
        System.out.print("Kaç Kilo armut istersiniz?");
        double armutKG = input.nextDouble();
        System.out.print("Kaç Kilo portakal istersiniz?");
        double portakalKG = input.nextDouble();
        
        System.out.println("Elma " + dict.get("elma") * elmaKG + " TL");
        System.out.println("Armut " + dict.get("armut") * armutKG + " TL");
        System.out.println("Portakal " + dict.get("portakal") * portakalKG + " TL");
        
        double toplamFiyat = (dict.get("elma") * elmaKG) + (dict.get("armut") * armutKG) + (dict.get("portakal") * portakalKG);
        System.out.println("Toplam Tutar: " + toplamFiyat + " TL");
        */
        
        /* Girilen doğum yılına göre yaşını hesaplayıp ehliyet alıp alamayacağını ekrana yazan program
        while(true)
            {
                System.out.print("Douğm Tarihiniz: ");
                int yas = Year.now().getValue() - input.nextInt();

                if(yas >= 18){ System.out.println("Ehliyet Alabilirsiniz."); }
                else if(yas == 17) { System.out.println("Seneye Alabilirsiniz."); break; }
                else System.out.println("Ehliyet Alamazsınız.");
        }
        */
        
        /* Vize ve final notları girilen öğrencinin ortalaması hesaplanıp harf notunu ekrana yazan program
        while(true)
        {
            System.out.print("Vize Notunuzu Giriniz: ");
            double vize = input.nextDouble();
            System.out.print("Final Notunuzu Giriniz: ");
            double fnl = input.nextDouble();

            double puan = 0.4 * vize + 0.6 * fnl;

            if(puan >= 85) System.out.println("Harf Notunuz --> A(" + puan + ")");
            else if(puan >= 75) System.out.println("Harf Notunuz --> B(" + puan + ")");
            else if(puan >= 50) System.out.println("Harf Notunuz --> C(" + puan + ")");
            else if(puan >= 35) System.out.println("Harf Notunuz --> D(" + puan + ")");
            else { System.out.println("Harf Notunuz --> F(" + puan + ")"); break; }
        }
        */
        
        
        /*Klavyeden Girilen 10 sayıyı Toplayan Program
        int toplam = 0;
        for(int i = 0; i < 10; i++)
        {
            System.out.print((i+1) + ". Sayıyı Giriniz: ");
            toplam += input.nextInt();
        }
        System.out.println("Toplam = " + toplam);
        */
        
        
        /* Klavyeden girilen 10 sayıdan çiftleri ve tekleri ayrı ayrı toplayan program
        int ciftToplam = 0;
        int tekToplam = 0;
        for(int i = 0; i < 10; i++)
        {
            System.out.print((i+1) + ". Sayıyı Giriniz: ");
            int sayi = input.nextInt();
            if(sayi % 2 == 0) ciftToplam += sayi; 
            else tekToplam += sayi; 
        }
        System.out.println("Tekler Toplamı = " + tekToplam);
        System.out.println("Çiftler Toplamı = " + ciftToplam);
        */
        
        /* 3x3 bir matrix'in satır ve sütün toplanlarını yazan program
        int[][] dizi = {{12, 5, 7}, {8, 25, 16}, {11, 11, 11}};
        int rowSum = 0; 
        int[] columnSum = new int[3];
        
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
                rowSum += dizi[i][j];
                switch(j)
                {
                    case 0:
                        columnSum[0] += dizi[i][j];
                        break;
                    case 1:
                        columnSum[1] += dizi[i][j];
                        break;
                    case 2:
                        columnSum[2] += dizi[i][j];
                        break;
                    default:
                        break;
                }
            }
            System.out.println(" | " + rowSum);
            rowSum = 0;
        }
        System.out.println("-- -- -- --");    
        System.out.print(columnSum[0] + " ");
        System.out.print(columnSum[1] + " ");
        System.out.println(columnSum[2] + " ");
        */
       
        
        /* klavyeden 0 girilene kadar girilen tüm sayıları Topla metodu ile toplayan program
        int toplam = 0, sayi;
        while(true)
        {
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();
            if(sayi != 0)
            {
                toplam = Topla(toplam, sayi);
                System.out.println("Yeni Toplam = " + toplam);
            }
            else{
                System.out.println("-----------------");
                System.out.println("Son Toplam = " + toplam);
                break;
            }
        }
        */
        
        
        /* Birden başlayıp sonsuza kadar giden tüm sayıları asal olup olmadığını kontrol edip txt ye yazan program
        int counter = 1;
        createToTxt();
        while(true)
        {
            if(asalKontrol(counter))
            {
                System.out.println(counter);
                writeToTxt(Integer.toString(counter));
            }
            counter++;
        }
        */
        
        Matematik mat = new Matematik();
        mat.topla(0, 0);
        mat.cikar(0, 0);
        mat.carp(0, 0);
        mat.bol(0, 0);
        
        Telefon phone = new Telefon();
        phone.model="samsung";
        phone.aramaYap(0);
        
        /* Encapsulation örneği Get Surname çalışıyor çünkü public anahtarı var, fakat Set edemiyoruz çünkü protected ve paket dışı kullanım izni yok.
        Kullanici kullanici = new Kullanici();
        //kullanici.name = "Sami";
        //kullanici.surname = "Hayatsever";
        System.out.println(kullanici.getSurname());
        kullanici.setSurname("Hayatsever");
        System.out.println(kullanici);
        */
    }
    
    public static int Topla(int s1, int s2) {
        return (s1 + s2);
    }
    
    public static boolean asalKontrol(int sayi) { // Verilen sayının asal olup olmadığını kontrol eden metod
        double bolen;
        if(sayi % 2 == 0) bolen = sayi / 2;
        else bolen = (sayi - 1) / 2;
        
        for (int i = 2; i <= bolen; i++) {
            if(sayi % i == 0)
                return false;
        }return true;
    }
    
    public static void createToTxt() { // aynı isimli txt dosya yoksa oluşturan metod
           try {
                File myObj = new File("Asal Sayılar.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                 System.out.println("An error occurred.");
                 e.printStackTrace();
            }
    }
    
    public static void writeToTxt(String text) { // belirtilen txt dosyasına verilen stringi yazan metod
           try {
                FileWriter myWriter = new FileWriter("Asal Sayılar.txt", true);
                myWriter.write(text + "\n");
                myWriter.close();
            } catch (IOException e) {
                 e.printStackTrace();
            }
    }
}
