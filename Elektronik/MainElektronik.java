/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Elektronik;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MainElektronik {
    public static void main (String args []){
        Scanner scanner = new Scanner (System.in);
    System.out.println("Pilih alat (1=TV, 2=Radio):");
    int pilihan = scanner.nextInt();

    AlatElektronik alat;
    if (pilihan == 1) {
        alat = new Televisi();
    } else if (pilihan == 2) {
        alat = new Radio();
    } else {
        System.out.println("Pilihan tidak valid");
        return;
    }

    System.out.println("Pilih aksi (1=Hidupkan, 2=Matikan):");
    int aksi = scanner.nextInt();

    if (aksi == 1) {
        alat.hidupkan();
    } else if (aksi == 2) {
        alat.matikan();
    } else {
        System.out.println("Aksi tidak valid");
}
    }
}
