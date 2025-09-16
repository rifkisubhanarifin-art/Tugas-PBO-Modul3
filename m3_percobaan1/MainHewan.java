/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.m3_percobaan1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MainHewan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih hewan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        System.out.print("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt();

        Hewan hewan; // Referensi polimorfisme

        if (pilihan == 1) {
            hewan = new Anjing(); // Polimorfisme: objek Anjing
        } else if (pilihan == 2) {
            hewan = new Kucing(); // Polimorfisme: objek Kucing
        } else {
            System.out.println("Pilihan tidak valid.");
            scanner.close();
            return;
        }

        // Memanggil metode suara secara polimorfik
        hewan.suara();

        scanner.close();
    }
}
