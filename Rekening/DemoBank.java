/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Rekening;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class DemoBank{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih rekening: 1.Tabungan  2.Giro  3.Deposito");
        int pilih = sc.nextInt();

        Rekening r;
        if (pilih == 1) {
            r = new RekeningTabungan("T001", 1000000);
        }else if (pilih == 2) {
            r = new RekeningGiro("G001", 500000);
        }
        else {
            r = new RekeningDeposito("D001", 2000000, false);
        }

        r.setor(500000);
        r.tarik(300000);

        sc.close();
    }
}