/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Rekening;

/**
 *
 * @author ASUS
 */
public class RekeningTabungan extends Rekening {
    private static final double BATAS_PENARIKAN = 5000000;
    
    public RekeningTabungan(String nomorRekening, double saldoAwal) {
        super(nomorRekening, saldoAwal);
    }
    
    @Override
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus positif!");
            return;
        }
        
        if (jumlah > BATAS_PENARIKAN) {
            System.out.println("Penarikan melebihi batas maksimal: " + BATAS_PENARIKAN);
            return;
        }
        
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil: " + jumlah);
            System.out.println("Saldo baru: " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }
    
    //Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Jenis: Tabungan");
        System.out.println("Batas Penarikan: " + BATAS_PENARIKAN);
    }
}
