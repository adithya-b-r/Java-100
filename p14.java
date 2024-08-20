import java.math.BigInteger;
import java.util.Scanner;

// class p14{
//   public static void main(String[] args) {
//     int n, fact=1;

//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter an interger to calculate its factorial : ");
//     n = sc.nextInt();

//     for(int i=1; i<=n; i++)
//       fact *= i;

//     System.out.println("Factorial of "+n+" is "+fact);
//     sc.close();
//   }
// }

class p14{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    BigInteger fact = new BigInteger("1");
    BigInteger inc = new BigInteger("1");

    System.out.print("Enter a large number to find its factorial : ");
    n = sc.nextInt();

    for(int i=1; i<=n; i++){
      fact = fact.multiply(inc);
      inc = inc.add(BigInteger.ONE);
    }

    System.out.println(fact);
    sc.close();
  }
}