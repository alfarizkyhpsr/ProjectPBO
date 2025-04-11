/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Alfa
 */
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }

    public double getLuas() { return sisi * sisi; }
    
    public double getSisi() {
    return sisi;
    }
}