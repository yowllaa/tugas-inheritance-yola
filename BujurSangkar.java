public class BujurSangkar extends Bentuk {
  private double sisi;

  public BujurSangkar(double sisi, String warna) {
      super(warna);
      this.sisi = sisi;
  }

  public double getSisi() {
      return sisi;
  }

  public void setSisi(double sisi) {
      this.sisi = sisi;
  }

  public double hitungLuas() {
      return sisi * sisi;
  }

  // Override method dari class Bentuk
  @Override
  public void printInfo() {
      System.out.println("Bujur Sangkar berwarna " + warna);
      System.out.println("Sisi  : " + sisi);
      System.out.println("Luas  : " + hitungLuas());
  }
}