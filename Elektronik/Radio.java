/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Elektronik;

/**
 *
 * @author ASUS
 */
public class Radio implements AlatElektronik {
    @Override
    public void hidupkan() {
        System.out.println("Radio dinyalakan: Ada suara musik!");
    }
    
    @Override
    public void matikan() {
        System.out.println("Radio dimatikan: Suara hilang...");
    }
}
