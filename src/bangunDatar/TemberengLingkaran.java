/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Alfa
 */
public class TemberengLingkaran extends Lingkaran {
    private final double sudut;

    public TemberengLingkaran(double jari, double sudut) {
        super(jari); 
        this.sudut = sudut;
    }

    @Override
    public void hitungLuas() {
        double jari = getJari();
        double luasJuring = (sudut / 360.0) * Math.PI * jari * jari;
        double luasSegitiga = 0.5 * jari * jari * Math.sin(Math.toRadians(sudut));
        System.out.println("Luas Tembereng: " + (luasJuring - luasSegitiga));
    }

    @Override
    public void hitungKeliling() {
        double jari = getJari();
        double panjangBusur = (sudut / 360.0) * 2 * Math.PI * jari;
        double chord = 2 * jari * Math.sin(Math.toRadians(sudut / 2.0));
        System.out.println("Keliling Tembereng: " + (panjangBusur + chord));
    }
}
