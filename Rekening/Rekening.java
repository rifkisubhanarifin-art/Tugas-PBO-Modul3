/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Rekening;

/**
 *
 * @author ASUS
 */
public abstract class Rekening {
    // Atribut umum semua rekening
    protected String nomorRekening;
    protected double saldo;
    
    // Constructor
    public Rekening(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
    }
    
    // Method konkret (implementasi sama untuk semua rekening)
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor berhasil: " + jumlah);
            System.out.println("Saldo baru: " + saldo);
        } else {
            System.out.println("Jumlah setor harus positif!");
        }
    }
    
    // Method abstrak (wajib diimplementasikan subclass)
    public abstract void tarik(double jumlah);
    
    // Method untuk menampilkan informasi
    public void getInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }
    
    // Getter dan Setter
    public String getNomorRekening() {
        return nomorRekening;
    }
    
    public double getSaldo() {
        return saldo;
    }
}