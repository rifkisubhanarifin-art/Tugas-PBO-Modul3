/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Elektronik;

/**
 *
 * @author ASUS
 */
public class Televisi implements AlatElektronik{
    //Override
    public void hidupkan(){
        System.out.println("TV dinyalakan: Ada gambar dan suara");
    }
    
    public void matikan (){
        System.out.println("TV dimatikan: Layar gelap.....");
    }
}
