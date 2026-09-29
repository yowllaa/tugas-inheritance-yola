public class Silinder extends Lingkaran {
  private double tinggi;

  // Constructor
  public Silinder(double tinggi, double radius, String warna) {
      super(radius, warna);
      this.tinggi = tinggi;
  }

  public double getTinggi() {
      return tinggi;
  }

  public void setTinggi(double tinggi) {
      this.tinggi = tinggi;
  }

  public double hitungVolume() {
      return hitungLuas() * tinggi;
  }

  @Override
  public void printInfo() {
      System.out.println("Silinder berwarna " + warna);
      System.out.println("Radius : " + radius);
      System.out.println("Tinggi : " + tinggi);
      System.out.println("Volume : " + hitungVolume());
  }
}