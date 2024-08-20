import java.util.Scanner;

class p41{
  public static void main(String[] args) {
    String s1;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string : ");
    s1 = sc.nextLine().toLowerCase();

    System.out.println(s1);
    sc.close();
  }
}