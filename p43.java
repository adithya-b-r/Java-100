import java.util.Scanner;

class p43{
  public static void main(String args[]){
    String str, str2, newCh, oldCh;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string : ");
    str = sc.nextLine();

    System.out.println("Length of string : "+str.length());

    System.out.print("Enter a old character to replace : ");
    oldCh = sc .nextLine();

    System.out.print("Enter a new character to replace : ");
    newCh = sc .nextLine();

    str = str.replace(oldCh, newCh);

    System.out.println("After replacing characters : "+str);

    System.out.print("Enter second string concatenate : ");
    str2 = sc.nextLine();

    str = str.concat(str2);

    System.out.println("New string after concatenation : "+str);
    sc.close();
  }
}