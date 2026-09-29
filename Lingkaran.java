public class Lingkaran extends Bentuk {
  protected double radius;
  public static final double PHI = 3.14;

  public Lingkaran(double radius, String warna) {
      super(warna);
      this.radius = radius;
  }

  public double getRadius() {
      return radius;
  }

  public void setRadius(double radius) {
      this.radius = radius;
  }

  public double hitungLuas() {
      return PHI * radius * radius;
  }

  // Override method dari class Bentuk
  @Override
  public void printInfo() {
      System.out.println("Lingkaran berwarna " + warna);
      System.out.println("Radius : " + radius);
      System.out.println("Luas   : " + hitungLuas());
  }
}