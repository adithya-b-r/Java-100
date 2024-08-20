import java.util.Scanner;

class p49{
  public static void main(String[] args) {
    int a, b, result;
    Scanner sc = new Scanner(System.in);

    System.out.println("Input two integers : ");
    a = sc.nextInt();
    b = sc.nextInt();

    try{
      result = a / b;
      System.out.println("Product : "+result);
    }catch(ArithmeticException e){
      System.out.println("Exception : "+e);
    }

    sc.close();
  }
}