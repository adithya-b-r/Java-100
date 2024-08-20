import java.util.Scanner;

class p11{
  public static void main(String[] args) {
    int marks;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your obtained marks : ");
    marks = sc.nextInt();

    if(marks >= 35){
      System.out.println("You Passed!");
    }else{
      System.out.println("Better Luck Next Time :)");
    }

    sc.close();
  }
}