import java.util.Scanner;

public class p6 {
  public static void main(String[] args) {
    int a, b, temp;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number : ");
    a = sc.nextInt();
    System.out.print("Enter second number : ");
    b = sc.nextInt();

    temp = a;
    a = b;
    b = temp;

    System.out.println("After swapping : \na = "+a+"\nb = "+b);
    sc.close();
  }
}