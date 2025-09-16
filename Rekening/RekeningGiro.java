/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Rekening;

/**
 *
 * @author ASUS
 */
public class RekeningGiro extends Rekening {
    private double batasOverdraft;
    
    public RekeningGiro(String nomorRekening, double saldoAwal, double batasOverdraft) {
        super(nomorRekening, saldoAwal);
        this.batasOverdraft = batasOverdraft;
    }
    
    @Override
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus positif!");
            return;
        }
        
        if (saldo - jumlah >= -batasOverdraft) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil: " + jumlah);
            System.out.println("Saldo baru: " + saldo);
            
            if (saldo < 0) {
                System.out.println("PERINGATAN: Saldo negatif! Menggunakan overdraft.");
            }
        } else {
            System.out.println("Penarikan ditolak! Melebihi batas overdraft.");
        }
    }
}