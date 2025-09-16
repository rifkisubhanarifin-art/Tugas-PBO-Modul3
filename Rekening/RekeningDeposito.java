/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.Rekening;

/**
 *
 * @author ASUS
 */
public class RekeningDeposito extends Rekening {
    private Boolean tanggalJatuhTempo;
    
    public RekeningDeposito(String nomorRekening, double saldoAwal, Boolean tanggalJatuhTempo) {
        super(nomorRekening, saldoAwal);
        this.tanggalJatuhTempo = tanggalJatuhTempo;
    }
    
    @Override
    public void tarik(double jumlah) {
        if (tanggalJatuhTempo && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik deposito: " + jumlah + " | Saldo: " + saldo);
        } else {
            System.out.println("Tidak bisa tarik. Deposito belum jatuh tempo.");
        }
    
    }
}
