import java.util.Scanner;

class p29{
  public static void main(String[] args) {
    String str;
    int a, b, length;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string to find it's substring : ");
    str = sc.nextLine();
    length = str.length();

    for(a=0; a<length; a++)
      for(b=1; b<=(length-a); b++){
        System.out.print(str.substring(a, a+b)+" ");
      }

    sc.close();
  }
}