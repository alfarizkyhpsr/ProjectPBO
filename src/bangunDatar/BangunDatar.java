/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Alfa
 */

public abstract class BangunDatar {
    public static final double PHI = 3.14;
    protected double luas;
    protected double keliling;

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public abstract void hitungLuas();
    public abstract void hitungKeliling();
}