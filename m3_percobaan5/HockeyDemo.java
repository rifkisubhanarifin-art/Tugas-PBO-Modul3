/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3.m3_percobaan5;

/**
 *
 * @author ASUS
 */
public class HockeyDemo implements Hockey, Event {
    public void setHomeTeam(String name) {
        System.out.println("Home team: " + name);
    }

    //Override
    public void setVisitingTeam(String name) {
        // Bisa ditambahkan logika sesuai kebutuhan
    }

    //Override
    public void homeGoalScored() {
        // Implementasi kosong sementara
    }

    //Override
    public void visitingGoalScored() {
        // Implementasi kosong sementara
    }

    //Override
    public void visitingTeamScored(){
        // Implementasi kosong sementara
    }
    //Override
    public void endOfPeriod(int period) {
        // Implementasi kosong sementara
    }

    //Override
    public void overtimePeriod(int ot) {
        // Implementasi kosong sementara
    }

    //Override
    public void organize() {
        System.out.println("Match organized.");
    }

    // Main method
    public static void main(String[] args) {
        HockeyDemo hockeyDemo = new HockeyDemo();
        hockeyDemo.setHomeTeam("India");
        hockeyDemo.organize();
    }
}
