import java.util.Scanner;

public class p5 {
  public static void main(String[] args) {
    Float f, c;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter fahrenheit : ");
    f = sc.nextFloat();

    c = (f - 32)*5/9;

    System.out.println("Celsius : "+c);
    sc.close();
  }
}