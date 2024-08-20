import java.util.Scanner;

class p21{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);

    while(true){
      System.out.print("Enter a number: ");
      n = sc.nextInt();

      if(n==0)
        break;

      System.out.println("You entered "+n);
    }

    sc.close();
  }
}