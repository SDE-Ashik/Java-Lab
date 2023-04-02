import java.util.*;
public class Complex1 {
    int real,img;
    void num()
    {
Scanner sc = new Scanner(System.in);

System.out.println("enter the real part of the  number");
 real = sc.nextInt();
System.out.println("enter the imaginary part:");
 img = sc.nextInt();
    }
void add(Complex1 c)
{
    System.out.println("Sum of two complex is");
    int r1=real+c.real;
    int r2=img+c.img;
    System.out.println(real + "+" +img +"i" +"+" + c.real +"+" +c.img +"i"+" = "+r1+"+" +r2 +"i");
}

public static void main(String args[])
{
    Complex1 c1 = new Complex1();
    c1.num();
    Complex1 c2 = new Complex1();
    c2.num();
    c2.add(c1);
}
}






















