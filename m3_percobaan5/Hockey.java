/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modul_3.m3_percobaan5;

/**
 *
 * @author ASUS
 */
public interface Hockey extends Sports{
    public void homeGoalScored();
    public void visitingTeamScored();
    public void endOfPeriod(int period);
    public void overtimePeriod(int ot);
}
