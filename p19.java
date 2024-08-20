import java.util.Scanner;

class p19{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an Integer : ");

    while((n = sc.nextInt()) != 0){
      System.out.println("You entered : "+n);
      System.out.print("Enter an Integer : ");
    }

    sc.close();
  }
}