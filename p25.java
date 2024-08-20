import java.util.Scanner;

class p25{
  public static void main(String[] args) {
    int a, b, c, d;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter range of numbers to print their multiplication table : ");
    System.out.print("Start Range : ");
    a = sc.nextInt();
    System.out.print("End Range : ");
    b = sc.nextInt();

    for(c = a; c<=b; c++){
    System.out.println("Multiplication table of : "+c);
    for(d = 1; d<=10; d++)
      System.out.println(c+" x "+d+" = "+(c*d));
    }

    sc.close();
  }
}