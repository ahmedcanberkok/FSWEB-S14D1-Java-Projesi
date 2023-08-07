package Silindir;

// Parent Class Animal child Class Cylinder
public class Cylinder extends  Circle {

  private   double height ;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height<0) {
            this.height = 0 ;
        } else {
            this.height = height ;
        }

    }

    public double getHeight() {
        return height;
    }

    public double getVolume ( ) {
        return  getArea() * height ;
    }
    //    super 0=> üst sınıf icin kullanılır. super() git üst sınıfın constructorını bul cağır diyor ;
}
