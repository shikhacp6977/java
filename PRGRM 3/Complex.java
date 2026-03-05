class Complex {
  int real;
  int img;
  Complex(int r,int i) {
    real = r;
    img = i;
  }
public static void main(String[] args) {
  Complex c1 = new Complex(3,4);
  Complex c2 = new Complex(2,5);
  int realsum = c1.real+c2.real;
  int imgsum = c1.img+c2.img;
System.out.println("First complex number is:"+c1.real+"+"+c1.img+"i");
System.out.println("Second complex number is:"+c2.real+"+"+c2.img+"i");
System.out.println("Sum of complex numbers:"+realsum+"+"+imgsum+"i");
}
}
