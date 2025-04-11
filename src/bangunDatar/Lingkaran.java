/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Alfa
 */
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
    return jari;
}

public double getLuas() {
    return Math.PI * jari * jari;
}

    @Override
    public void hitungLuas() {
        double luas = BangunDatar.PHI * jari * jari;
        System.out.println("Luas lingkaran: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = 2 * BangunDatar.PHI * jari;
        System.out.println("Keliling lingkaran: " + keliling);
    }

    public double getJariJari() {
        return jari;
    }
}