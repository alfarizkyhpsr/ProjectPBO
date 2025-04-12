
# 📐 Project PBO: Bangun Datar & Bangun Ruang

Project ini merupakan implementasi konsep **PBO (Pemrograman Berorientasi Objek)** untuk merepresentasikan **bangun datar** dan **bangun ruang** menggunakan Java. Setiap bangun merupakan objek dengan fungsi penghitungan luas, keliling, dan volume secara polimorfik.

---

## 🔷 bangunDatar

Berisi class-class abstrak dan turunan untuk bangun datar seperti:
- **BangunDatar (abstrak)** → superclass semua bangun datar.
- **Belah Ketupat**
- **Jajar Genjang**
- **Juring Lingkaran**
- **Layang-Layang**
- **Lingkaran**
- **Persegi**
- **PersegiPanjang**
- **Segitiga**
- **Tembereng Lingkaran**
- **Trapesium**

### ✨ Konsep:
- Setiap class override method `hitungLuas()` dan `hitungKeliling()`.
- Class `BangunDatar` menyediakan method `getLuas()` dan `getKeliling()` untuk diakses oleh class lain (misal `bangunRuang`).
- Class seperti `Segitiga` dan `LayangLayang` menerima parameter sisi tambahan sesuai kebutuhan.

---

## 🔷 bangunRuang

Berisi class-class turunan dari abstrak `BangunRuang`, seperti:
- **BangunRuang (abstrak)** → superclass semua bangun ruang.
- **Bola**
- **Tabung**
- **Kubus**
- **Balok**
- **Limas**
- **PrismaSegitiga**
- **PrismaSegiempat**

### ✨ Konsep:
- Masing-masing mengoverride method:
  - `hitungVolume()`
  - `hitungLuasPermukaan()`
- Menggunakan objek dari `bangunDatar` untuk perhitungan luas alas (komposisi).
  Contoh:
  ```java
  this.alas = new Persegi(6); // digunakan di dalam Limas
  ```

### 🛠️ Fitur Tambahan:
- Class `Limas` sekarang mendukung parameter `sisiTegak[]` untuk menghitung luas permukaan secara lengkap.
- Class `PrismaSegitiga` dan `PrismaSegiempat` mendukung constructor fleksibel, dan menghitung volume + permukaan dengan memanfaatkan objek `Segitiga` atau `PersegiPanjang`.

---

## 🚀 main/Main.java

File utama untuk menjalankan semua demo polimorfisme:
- Mencoba semua objek `BangunDatar` dan `BangunRuang`
- Menampilkan hasil `hitungLuas()`, `hitungKeliling()`, `hitungVolume()` dan `hitungLuasPermukaan()`.

### 👇 Contoh Polimorfisme:
```java
BangunDatar bd = new Lingkaran(7);
bd.hitungLuas();
bd.hitungKeliling();

BangunRuang br = new Tabung(7, 10);
br.hitungVolume();
br.hitungLuasPermukaan();
```

---

## 📌 Ketergantungan Antar Kelas
- `BangunRuang` menggunakan `BangunDatar` sebagai komposisi.
- Kode seperti `PrismaSegitiga` dan `Limas` sangat tergantung pada method `getLuas()` dari objek `BangunDatar`.
- Seluruh bangun mengikuti prinsip **inheritance**, **encapsulation**, dan **polymorphism**.

---

## 🧪 Pengujian & Output

Setiap method `hitungLuas()`, `hitungKeliling()`, `hitungVolume()`, dan `hitungLuasPermukaan()` akan mencetak hasil di console saat `Main.java` dijalankan.

---

## 💡 Saran Pengembangan Selanjutnya

- Tambahkan fitur validasi input (misalnya panjang sisi tidak boleh negatif).
- Tambahkan `toString()` untuk tiap bangun agar representasinya lebih informatif.
- Ekspor hasil perhitungan ke file atau GUI sederhana.


---

## 🔍 Analisis Per Program

### ✅ BangunDatar

#### 1. BangunDatar (Abstrak)
- Sebagai superclass dari semua bangun datar.
- Method abstrak:
  - `hitungLuas()`
  - `hitungKeliling()`
- Method konkrit:
  - `getLuas()`, `getKeliling()` untuk mengakses nilai hasil perhitungan luas dan keliling.

#### 2. Lingkaran
- Menggunakan rumus:
  - Luas = π × r²
  - Keliling = 2 × π × r
- Disimpan dalam variabel `jariJari`.

#### 3. Persegi
- Properti sisi disimpan.
- Luas = sisi²
- Keliling = 4 × sisi

#### 4. PersegiPanjang
- Properti: panjang dan lebar.
- Luas = panjang × lebar
- Keliling = 2 × (panjang + lebar)

#### 5. Segitiga
- Menggunakan alas, tinggi, dan dua sisi miring.
- Luas = 0.5 × alas × tinggi
- Keliling = alas + sisiA + sisiB

#### 6. LayangLayang
- Properti: dua pasang sisi berdekatan dan diagonal.
- Luas = 0.5 × d1 × d2
- Keliling = 2 × (sisiA + sisiB)

#### 7. JuringLingkaran
- Luas = (sudut/360) × π × r²
- Keliling = panjang busur + 2 × jariJari

---

### ✅ BangunRuang

#### 1. BangunRuang (Abstrak)
- Superclass semua bangun ruang.
- Method abstrak:
  - `hitungVolume()`
  - `hitungLuasPermukaan()`

#### 2. Bola
- Properti: jari-jari
- Volume = 4/3 × π × r³
- Luas Permukaan = 4 × π × r²

#### 3. Tabung
- Menggunakan Lingkaran dari `BangunDatar`.
- Volume = luas alas × tinggi
- Permukaan = 2 × luas alas + keliling × tinggi

#### 4. Kubus
- Volume = sisi³
- Permukaan = 6 × sisi²

#### 5. Balok
- Volume = panjang × lebar × tinggi
- Permukaan = 2 × (pl + pt + lt)

#### 6. Limas
- Menggunakan objek `BangunDatar` untuk alas (misal Persegi).
- Volume = (1/3) × luas alas × tinggi
- Permukaan = luas alas + jumlah sisi tegak

#### 7. PrismaSegitiga
- Komposisi objek Segitiga dari `bangunDatar`.
- Volume = luas alas × tinggi prisma
- Permukaan = 2 × luas alas + keliling alas × tinggi

#### 8. PrismaSegiempat
- Komposisi objek PersegiPanjang dari `bangunDatar`.
- Volume = luas alas × tinggi prisma
- Permukaan = 2 × luas alas + keliling alas × tinggi

---

### ✅ Main.java
- Menunjukkan penggunaan **polimorfisme**.
- Semua objek `BangunDatar` dan `BangunRuang` dipanggil menggunakan superclass-nya.
- Diletakkan di folder `main` untuk menjaga pemisahan struktur program.
- Menambahkan LayangLayang dan JuringLingkaran sebagai bentuk evaluasi polimorfik tambahan.



---

## 🛠️ Daftar Perbaikan yang Dilakukan

### 🔧 bangunDatar

- **Segitiga.java**
  - Menambahkan constructor tambahan agar sesuai dengan kebutuhan `PrismaSegitiga`.
  - Getter method `getAlas()` dan `getTinggi()` ditambahkan untuk mendukung bangun ruang.

- **LayangLayang.java**
  - Menambahkan parameter lengkap: 2 diagonal dan 2 pasang sisi.
  - Hitung luas menggunakan rumus ½ × d1 × d2.
  - Keliling = 2 × (sisiA + sisiB)

- **JuringLingkaran.java**
  - Ditambahkan perhitungan keliling juring.
  - Penyesuaian agar dapat digunakan dalam `Main.java`.

---

### 🔧 bangunRuang

- **PrismaSegitiga.java**
  - Constructor awal menyebabkan error karena tidak mencakup parameter `sisiA` dan `sisiB`.
  - Diperbaiki dengan constructor:
    ```java
    public PrismaSegitiga(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma, double sisiA, double sisiB)
    ```
  - Menggunakan `Segitiga` sebagai komposisi untuk menghitung luas dan keliling.
  - Tambahan getter di `Segitiga` memungkinkan ini berjalan dengan baik.

- **Limas.java**
  - Awalnya belum mendukung penghitungan permukaan.
  - Ditambahkan parameter sisiTegak (array of double).
  - Menggunakan `BangunDatar` (Persegi atau lainnya) sebagai alas.
  - Permukaan = luas alas + jumlah luas sisi tegak.

- **Tabung.java**
  - Perbaikan dalam pemanfaatan `Lingkaran` untuk alas dan keliling.
  - Volume dan permukaan dihitung berdasarkan objek `Lingkaran`.

- **PrismaSegiempat.java**
  - Menggunakan `PersegiPanjang` sebagai alas.
  - Hitung permukaan dan volume dengan metode yang mirip dengan PrismaSegitiga.

---

### 🔧 main/Main.java

- Disusun ulang agar:
  - Mencakup semua objek `BangunDatar` dan `BangunRuang`.
  - Menggunakan prinsip polimorfisme penuh.
- Ditambahkan pengujian untuk:
  - `LayangLayang`
  - `JuringLingkaran`
  - Semua objek `BangunRuang` (dengan objek `BangunDatar` sebagai alas)
---

## 👥 Tim Pengembang

- Luthfi Alaudin R
- Arya Rudy S
- Millatina Hasya S
- Luthfiyya Nur R
- Isyraf Fajar A
- Alfa Rizky H

---

