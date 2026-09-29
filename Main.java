import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n================================");
            System.out.println("       PROGRAM BANGUN RUANG");
            System.out.println("================================");
            System.out.println("1. Bujur Sangkar");
            System.out.println("2. Lingkaran");
            System.out.println("3. Silinder");
            System.out.println("4. Demo Semua Objek");
            System.out.println("0. Keluar");
            System.out.println("================================");
            System.out.print("Pilih menu : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.println("\n--- BUJUR SANGKAR ---");

                    System.out.print("Masukkan warna : ");
                    String warnaBujur = input.nextLine();

                    System.out.print("Masukkan sisi  : ");
                    double sisi = input.nextDouble();
                    input.nextLine();

                    // Membuat objek BujurSangkar
                    BujurSangkar bujur =
                            new BujurSangkar(sisi, warnaBujur);

                    System.out.println("\nHasil:");
                    bujur.printInfo();

                    // Eksplorasi setter
                    System.out.print("\nIngin mengubah sisi? (y/n) : ");
                    String ubahSisi = input.nextLine();

                    if (ubahSisi.equalsIgnoreCase("y")) {
                        System.out.print("Masukkan sisi baru : ");
                        double sisiBaru = input.nextDouble();
                        input.nextLine();

                        bujur.setSisi(sisiBaru);

                        System.out.println("\nData setelah diubah:");
                        bujur.printInfo();
                    }

                    break;


                case 2:
                    System.out.println("\n--- LINGKARAN ---");

                    System.out.print("Masukkan warna  : ");
                    String warnaLingkaran = input.nextLine();

                    System.out.print("Masukkan radius : ");
                    double radius = input.nextDouble();
                    input.nextLine();

                    // Membuat objek Lingkaran
                    Lingkaran lingkaran =
                            new Lingkaran(radius, warnaLingkaran);

                    System.out.println("\nHasil:");
                    lingkaran.printInfo();

                    // Eksplorasi getter
                    System.out.println("\nRadius melalui getter = "
                            + lingkaran.getRadius());

                    System.out.print("Ingin mengubah radius? (y/n) : ");
                    String ubahRadius = input.nextLine();

                    if (ubahRadius.equalsIgnoreCase("y")) {
                        System.out.print("Masukkan radius baru : ");
                        double radiusBaru = input.nextDouble();
                        input.nextLine();

                        lingkaran.setRadius(radiusBaru);

                        System.out.println("\nData setelah diubah:");
                        lingkaran.printInfo();
                    }

                    break;


                case 3:
                    System.out.println("\n--- SILINDER ---");

                    System.out.print("Masukkan warna  : ");
                    String warnaSilinder = input.nextLine();

                    System.out.print("Masukkan radius : ");
                    double radiusSilinder = input.nextDouble();

                    System.out.print("Masukkan tinggi : ");
                    double tinggi = input.nextDouble();
                    input.nextLine();

                    // Membuat objek Silinder
                    Silinder silinder =
                            new Silinder(
                                    tinggi,
                                    radiusSilinder,
                                    warnaSilinder
                            );

                    System.out.println("\nHasil:");
                    silinder.printInfo();

                    // Method yang diwarisi dari Lingkaran
                    System.out.println("\nLuas alas = "
                            + silinder.hitungLuas());

                    // Method milik Silinder
                    System.out.println("Volume   = "
                            + silinder.hitungVolume());

                    System.out.print("\nIngin mengubah tinggi? (y/n) : ");
                    String ubahTinggi = input.nextLine();

                    if (ubahTinggi.equalsIgnoreCase("y")) {
                        System.out.print("Masukkan tinggi baru : ");
                        double tinggiBaru = input.nextDouble();
                        input.nextLine();

                        silinder.setTinggi(tinggiBaru);

                        System.out.println("\nData setelah diubah:");
                        silinder.printInfo();
                    }

                    break;


                case 4:
                    System.out.println("\n=== DEMO SEMUA OBJEK ===");

                    // Objek dari class Bentuk
                    Bentuk bentuk = new Bentuk("Putih");

                    // Objek dari subclass
                    BujurSangkar bs =
                            new BujurSangkar(5, "Merah");

                    Lingkaran ling =
                            new Lingkaran(7, "Biru");

                    Silinder sil =
                            new Silinder(10, 5, "Hijau");

                    System.out.println("\n1. Objek Bentuk");
                    bentuk.printInfo();

                    System.out.println("\n2. Objek Bujur Sangkar");
                    bs.printInfo();

                    System.out.println("\n3. Objek Lingkaran");
                    ling.printInfo();

                    System.out.println("\n4. Objek Silinder");
                    sil.printInfo();

                    // Mengubah data menggunakan setter
                    System.out.println("\n--- Percobaan Setter & Getter ---");

                    bs.setSisi(8);
                    ling.setRadius(10);
                    sil.setTinggi(15);

                    System.out.println(
                            "Sisi Bujur Sangkar setelah diubah = "
                                    + bs.getSisi()
                    );

                    System.out.println(
                            "Radius Lingkaran setelah diubah = "
                                    + ling.getRadius()
                    );

                    System.out.println(
                            "Tinggi Silinder setelah diubah = "
                                    + sil.getTinggi()
                    );

                    System.out.println("\n--- Hasil Perhitungan Baru ---");

                    System.out.println(
                            "Luas Bujur Sangkar = "
                                    + bs.hitungLuas()
                    );

                    System.out.println(
                            "Luas Lingkaran = "
                                    + ling.hitungLuas()
                    );

                    System.out.println(
                            "Volume Silinder = "
                                    + sil.hitungVolume()
                    );

                    break;


                case 0:
                    System.out.println("\nProgram selesai.");
                    break;


                default:
                    System.out.println(
                            "\nPilihan tidak tersedia."
                    );
            }

        } while (pilihan != 0);

        input.close();
    }
}