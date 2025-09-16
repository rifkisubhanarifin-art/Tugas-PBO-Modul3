/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Mesin;

/**
 *
 * @author ASUS
 */
public abstract class Kendaraan {
    // Metode abstrak
    public abstract void nyalakanMesin();
    
    // Metode non-abstrak
    public void matikanMesin() {
        System.out.println("Mesin dimatikan...");
    }
}
