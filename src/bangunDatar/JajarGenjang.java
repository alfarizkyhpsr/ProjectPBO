/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Alfa
 */
public class JajarGenjang extends BangunDatar {
    private double alas;
    private double sisiMiring;
    private double tinggi;

    public JajarGenjang(double alas, double sisiMiring, double tinggi) {
        this.alas = alas;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        double luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = (alas + sisiMiring) * 2;
        System.out.println("Keliling Jajar Genjang: " + keliling);
    }
}
