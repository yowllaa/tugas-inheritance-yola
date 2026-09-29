# Latihan Inheritance - Object Oriented Programming

## Struktur Class

Program terdiri dari beberapa class dengan hubungan inheritance sebagai berikut:

```text
              Bentuk
             /      \
            /        \
   BujurSangkar    Lingkaran
                       |
                    Silinder
```

`Bentuk` digunakan sebagai parent class.  
`BujurSangkar` dan `Lingkaran` merupakan turunan dari `Bentuk`, sedangkan `Silinder` merupakan turunan dari `Lingkaran`.

## Struktur File

```text
├── Bentuk.java
├── BujurSangkar.java
├── Lingkaran.java
├── Silinder.java
├── Main.java
└── README.md
```

### Bentuk.java

Class dasar yang menyimpan atribut `warna`.

Method yang tersedia:

- `getWarna()`
- `setWarna()`
- `printInfo()`

### BujurSangkar.java

Class turunan dari `Bentuk` yang memiliki atribut tambahan berupa `sisi`.

Method utama:

- `getSisi()`
- `setSisi()`
- `hitungLuas()`
- `printInfo()`

Luas bujur sangkar dihitung menggunakan:

```text
Luas = sisi × sisi
```

### Lingkaran.java

Class turunan dari `Bentuk` yang memiliki atribut `radius` dan konstanta `PHI`.

Method utama:

- `getRadius()`
- `setRadius()`
- `hitungLuas()`
- `printInfo()`

Luas lingkaran dihitung menggunakan:

```text
Luas = PHI × radius × radius
```

### Silinder.java

Class `Silinder` merupakan turunan dari `Lingkaran`. Class ini mewarisi atribut dan method yang dimiliki `Lingkaran`, kemudian menambahkan atribut `tinggi`.

Method utama:

- `getTinggi()`
- `setTinggi()`
- `hitungVolume()`
- `printInfo()`

Volume silinder dihitung menggunakan:

```text
Volume = luas alas × tinggi
```

## Konsep OOP yang Digunakan

Beberapa konsep yang diterapkan pada latihan ini antara lain:

**Inheritance**

Inheritance diterapkan menggunakan keyword `extends`.

```java
public class BujurSangkar extends Bentuk
```

```java
public class Lingkaran extends Bentuk
```

```java
public class Silinder extends Lingkaran
```

Dengan inheritance, subclass dapat menggunakan atribut dan method yang sudah dimiliki parent class.

**Constructor dan `super()`**

Constructor pada subclass menggunakan `super()` untuk memanggil constructor dari parent class.

Contoh:

```java
public Lingkaran(double radius, String warna) {
    super(warna);
    this.radius = radius;
}
```

**Method Overriding**

Method `printInfo()` dari class `Bentuk` ditulis kembali pada masing-masing subclass agar informasi yang ditampilkan sesuai dengan objeknya.

```java
@Override
public void printInfo() {
    System.out.println("Lingkaran berwarna " + warna);
    System.out.println("Radius : " + radius);
    System.out.println("Luas   : " + hitungLuas());
}
```

**Getter dan Setter**

Getter digunakan untuk mengambil nilai atribut, sedangkan setter digunakan untuk mengubah nilainya.

Contoh:

```java
lingkaran.setRadius(10);

System.out.println(lingkaran.getRadius());
```

## Program Utama

Pada `Main.java` digunakan `Scanner` agar pengguna dapat memilih objek yang ingin dibuat dan memasukkan nilai secara langsung melalui terminal.

Menu yang tersedia:

```text
================================
       PROGRAM BANGUN RUANG
================================
1. Bujur Sangkar
2. Lingkaran
3. Silinder
4. Demo Semua Objek
0. Keluar
================================
Pilih menu :
```

Menu **Demo Semua Objek** digunakan untuk mencoba beberapa objek sekaligus dan melihat penggunaan constructor, getter, setter, inheritance, serta method perhitungan.

## Contoh Penggunaan

Contoh ketika memilih menu Bujur Sangkar:

```text
--- BUJUR SANGKAR ---
Masukkan warna : Merah
Masukkan sisi  : 5

Hasil:
Bujur Sangkar berwarna Merah
Sisi  : 5.0
Luas  : 25.0

Ingin mengubah sisi? (y/n) : y
Masukkan sisi baru : 8

Data setelah diubah:
Bujur Sangkar berwarna Merah
Sisi  : 8.0
Luas  : 64.0
```

## Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terinstall.

Compile seluruh file:

```bash
javac *.java
```

Kemudian jalankan:

```bash
java Main
```

## Catatan

Program ini dibuat sebagai latihan untuk memahami bagaimana hubungan antara parent class dan subclass bekerja pada Java.

Bagian `Main.java` dikembangkan dengan menu sederhana agar pembuatan objek dan pemanggilan method dari setiap class dapat dicoba secara langsung.
