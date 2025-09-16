/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Mesin;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MesinKendaraan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Pilihan (1/2): ");
        
        int pilihan = scanner.nextInt();
        Kendaraan kendaraan;
        
        if (pilihan == 1) {
            kendaraan = new Mobil();
        } else if (pilihan == 2) {
            kendaraan = new Motor();
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }
        
        // Gunakan polimorfisme
        kendaraan.nyalakanMesin();
        kendaraan.matikanMesin();
    }
}
