import java.util.Scanner;

public class p4 {
  public static void main(String[] args) {
    int a;
    float b;
    String c;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a Integer : ");
    a = sc.nextInt();
    System.out.print("Enter a Float : ");
    b = sc.nextFloat();
    System.out.print("Enter a String : ");
    c = sc.next();

    System.out.println("Integer : "+a+"\nFloat : "+b+"\nString : "+c);
    sc.close();
  }
}
