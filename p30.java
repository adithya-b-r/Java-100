import java.util.Scanner;

class p30{
  public static void main(String[] args) {
    String str, reverse="";

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string to reverse : ");
    str = sc.nextLine();

    for(int i=str.length()-1; i>=0; i--){
      reverse += str.charAt(i);
    }

    System.out.println("Original String : "+str+"\nReversed String : "+reverse);

    sc.close();
  }
}