/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Hewan;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Pilih hewan");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        
        System.out.println("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt();
        
        Hewan hewan; //Referensi polimorfisme
        
        if (pilihan == 1){
            hewan = new Burung (); //Polimorfisme, objek Anjing
        } else if (pilihan == 2){
            hewan = new Anjing();  //Polimorfisme, objek Kucing
        }else if (pilihan == 3) {
            hewan = new Kucing();
        }else{
            System.out.println("Pilihan tidak valid.");
            return;
        }
        
        hewan.suara();
        
        scanner.close();
    }
}
