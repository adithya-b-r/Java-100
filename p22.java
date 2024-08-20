import java.util.Scanner;

class p22{
  public static void main(String[] args) {
    char ch;
    Scanner sc = new Scanner(System.in);

    while(true){
      System.out.print("Enter a character ('b' for break and 'c' for continue): ");
      ch = sc.next().charAt(0);

      if(ch == 'b')
        break;
      else if(ch == 'c')
        continue;
      else 
        System.out.println("You entered : "+ch);
    }

    sc.close();
  }
}