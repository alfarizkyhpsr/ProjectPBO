/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.Segitiga;
/**
 *
 * @author Alfa
 */
public class PrismaSegitiga extends BangunRuang {
    private Segitiga alas;
    private double tinggi;

    public PrismaSegitiga(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma, double sisiA, double sisiB) {
        this.alas = new Segitiga(alasSegitiga, tinggiSegitiga, sisiA, sisiB);
        this.tinggi = tinggiPrisma;
    }

    @Override
    public void hitungVolume() {
        double volume = alas.getLuas() * tinggi;
        System.out.println("Volume Prisma Segitiga: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double a = alas.getAlas();
        double t = alas.getTinggi();
        double sisiMiring = Math.sqrt(Math.pow(a / 2, 2) + Math.pow(t, 2));
        double luas = 2 * alas.getLuas() + (a + 2 * sisiMiring) * tinggi;
        System.out.println("Luas Permukaan Prisma Segitiga: " + luas);
    }
}
