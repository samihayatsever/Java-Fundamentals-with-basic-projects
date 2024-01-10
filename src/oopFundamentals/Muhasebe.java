/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopFundamentals;

/**
 *
 * @author samih
 */
public class Muhasebe {
    public int toplamPara = 0;
    public String yetkiliMuhasebeci = "Yasin";
    
    public void paraYatir(int para)
    {
        toplamPara += para;
        System.out.println("Para Eklendi.");
    }
    
    public void paraCek(int para)
    {
        toplamPara -= para;
        System.out.println("Para Çekildi");
    }
    
    public void toplamParaGoster()
    {
        System.out.println(toplamPara);
    }
}
