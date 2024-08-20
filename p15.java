import java.util.Scanner;

class p15{
  public static void main(String[] args) {
    String s1, s2;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first string : ");
    s1 = sc.nextLine();
    System.out.print("Enter second string : ");
    s2 = sc.nextLine();

    if(s1.compareTo(s2) > 0)
      System.out.println("First string is greater than second string");
    else if(s1.compareTo(s2) < 0)
      System.out.println("Second string is greater than first string");
    else
      System.out.println("Both strings are of equal length");

    sc.close();
  }
}