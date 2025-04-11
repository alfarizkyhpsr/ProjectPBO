/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Alfa
 */
import bangunDatar.*;
import bangunRuang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bangun Datar ===");

        // Polymorphism - Lingkaran
        BangunDatar lingkaran = new Lingkaran(7);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();

        System.out.println("====================");

        // Polymorphism - Persegi
        BangunDatar persegi = new Persegi(3);
        persegi.hitungLuas();
        persegi.hitungKeliling();

        System.out.println("====================");

        // Polymorphism - Segitiga
        BangunDatar segitiga = new Segitiga(3, 4, 5, 6);
        segitiga.hitungLuas();
        segitiga.hitungKeliling();

        System.out.println("====================");

        // Polymorphism - Layang-Layang
        BangunDatar layangLayang = new LayangLayang(3, 4, 5, 6, 8, 9);
        layangLayang.hitungLuas();
        layangLayang.hitungKeliling();

        System.out.println("====================");

        // Polymorphism - Persegi Panjang
        BangunDatar persegiPanjang = new PersegiPanjang(5, 2);
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();

        System.out.println("====================");

        // Polymorphism - Juring Lingkaran
        BangunDatar juring = new JuringLingkaran(10, 90);
        juring.hitungLuas();
        juring.hitungKeliling();

        System.out.println("====================");
        System.out.println("=== Bangun Ruang ===");

        Bola bola = new Bola(7);
        bola.hitungVolume();
        bola.hitungLuasPermukaan();

        System.out.println("--------------------");

        Tabung tabung = new Tabung(7, 10);
        tabung.hitungVolume();
        tabung.hitungLuasPermukaan();

        System.out.println("--------------------");

        Kubus kubus = new Kubus(5);
        kubus.hitungVolume();
        kubus.hitungLuasPermukaan();

        System.out.println("--------------------");

        Balok balok = new Balok(4, 6, 8);
        balok.hitungVolume();
        balok.hitungLuasPermukaan();

        System.out.println("--------------------");

        double[] sisiTegak = {18, 18, 18, 18};
        Limas limas = new Limas(new Persegi(6), 10, sisiTegak);
        limas.hitungVolume();
        limas.hitungLuasPermukaan();

        System.out.println("--------------------");

        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(6, 4, 10, 5, 6);
        prismaSegitiga.hitungVolume();
        prismaSegitiga.hitungLuasPermukaan();

        System.out.println("--------------------");

        PrismaSegiempat prismaPersegi = new PrismaSegiempat(new Persegi(5), 10);
        prismaPersegi.hitungVolume();
        prismaPersegi.hitungLuasPermukaan();

        PrismaSegiempat prismaPP = new PrismaSegiempat(new PersegiPanjang(4, 3), 8);
        prismaPP.hitungVolume();
        prismaPP.hitungLuasPermukaan();
    }
}
