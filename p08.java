import java.math.BigInteger;
import java.util.Scanner;

class p08{
  public static void main(String[] args) {
    String a, b;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number : ");
    a = sc.nextLine();
    System.out.print("Enter second number : ");
    b = sc.nextLine();

    BigInteger num1 = new BigInteger(a);
    BigInteger num2 = new BigInteger(b);
    BigInteger sum;

    sum = num1.add(num2);

    System.out.println("Sum of "+num1+" and "+num2+" : "+sum);
    sc.close();
  }
}