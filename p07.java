import java.util.Scanner;

public class p07 {
  public static void main(String[] args) {
    int a, b;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number : ");
    a = sc.nextInt();
    System.out.print("Enter second number : ");
    b = sc.nextInt();

    b = a+b;
    a = b-a;
    b = b-a;

    System.out.println("After swapping : \na = "+a+"\nb = "+b);
    sc.close();
  }
}