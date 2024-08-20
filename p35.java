import java.util.Scanner;

class p35{
  public static void main(String args[]){
    String s1, s2;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first string : ");
    s1 = sc.nextLine();
    System.out.print("Enter second string : ");
    s2 = sc.nextLine();

    System.out.println(s1.compareTo(s2));
    System.out.println(s2.compareTo(s1));
    sc.close();
  }
}