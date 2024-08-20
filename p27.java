import java.util.Scanner;

class p27{
  public static void main(String[] args) {
    int n, sum=0, temp, orgNum, digits;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number to check for armstrong number : ");
    n = sc.nextInt();
    orgNum = n;
    digits = Integer.toString(n).length();


    while(n != 0){
      temp = n%10;
      sum += Math.pow(temp, digits);
      n /= 10;
    }

    if(orgNum == sum)
      System.out.println("Entered number is an armstrong number!");
    else
      System.out.println("Entered number is not an armstrong number!");

    sc.close();
  }
}