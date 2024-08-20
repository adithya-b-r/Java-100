import java.util.Scanner;

class p50{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter age : ");
    validateAge(sc.nextInt());
    
    sc.close();
  }

  static void validateAge(int age){
    if(age < 18)
      throw new ArithmeticException("Not Valid");
    else
      System.out.println("Eligible to Vote!");
  }
}