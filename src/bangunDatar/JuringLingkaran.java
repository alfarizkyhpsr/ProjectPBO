/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Alfa
 */
public class JuringLingkaran extends Lingkaran {
    private double sudut;

    public JuringLingkaran(double jari, double sudut) {
        super(jari); // Memanggil konstruktor Lingkaran
        this.sudut = sudut;
    }

    @Override
    public void hitungLuas() {
        double luas = (sudut / 360) * (BangunDatar.PHI * getJariJari() * getJariJari());
        System.out.println("Luas Juring Lingkaran: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = (sudut / 360) * 2 * BangunDatar.PHI * getJariJari() + 2 * getJariJari();
        System.out.println("Keliling Juring Lingkaran: " + keliling);
    }
}