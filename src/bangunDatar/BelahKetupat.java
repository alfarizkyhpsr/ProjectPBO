/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Alfa
 */
public class BelahKetupat extends BangunDatar {
    double diagonalA;
    double diagonalB;
    double sisi;

    public BelahKetupat(double diagonalA, double diagonalB, double sisi) {
        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        double luas = diagonalA * diagonalB / 2;
        System.out.println("Luas Belah Ketupat: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = sisi * 4;
        System.out.println("Keliling Belah Ketupat: " + keliling);
    }
}
