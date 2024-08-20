import java.util.Scanner;

class p31{
  public static void main(String[] args) {
    String str;
    int len, start, end, mid, i;

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string to check for palindrome : ");
    str = sc.nextLine();

    len = str.length();
    start = 0;
    end = len - 1;
    mid = (start+end)/2;

    for(i=start; i<=mid; i++){
      if(str.charAt(start) == str.charAt(end)){
        start++;
        end--;
      }else{
        break;
      }
    }

    if(i == mid+1)
      System.out.println("Entered string is a palindrome!");
    else
      System.out.println("Entered string is not a palindrome!");

    sc.close();
  }
}