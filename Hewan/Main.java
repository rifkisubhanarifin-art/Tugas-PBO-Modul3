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
 public static void main(String[] args) {
        Hewan[] hewan = new Hewan[3];
        hewan[0] = new Kucing();
        hewan[1] = new Anjing();
        hewan[2] = new Burung();  // Tambah burung
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih hewan (0=Kucing, 1=Anjing, 2=Burung):");
        int pilihan = scanner.nextInt();
        
        if (pilihan >= 0 && pilihan < hewan.length) {
            hewan[pilihan].suara();
            } else {
            System.out.println("Pilihan tidak valid!");
        }
        
        // Tampilkan semua suara
        System.out.println("\nSemua suara hewan:");
        for (Hewan h : hewan) {
            h.suara();  // Polimorfisme di sini
        }
    }
}