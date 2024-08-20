import java.util.Scanner;

class p09{
  public static void main(String args[]){
    int num1, num2, num3;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number : ");
    num1 = sc.nextInt();
    System.out.print("Enter second number : ");
    num2 = sc.nextInt();
    System.out.print("Enter third number : ");
    num3 = sc.nextInt();

    if(num1 > num2 && num1 > num3){
      System.out.println(num1+" is greatest");
    }else{
      if(num2 > num3){
        System.out.println(num2+" is greatest");
      }else{
        System.out.println(num3+" is greatest");
      }
    }

    sc.close();
  }
}