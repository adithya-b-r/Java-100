import java.util.Scanner;

class p20{
  public static void main(String[] args) {
    int num, reverse = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    num = sc.nextInt();
    int orgNum = num;

    while(num != 0){
      reverse = reverse * 10;
      reverse += num%10;
      num = num/10;
    }

    System.out.println("Entered number "+orgNum+"\nReversed number : "+reverse);
    sc.close();
  }
}