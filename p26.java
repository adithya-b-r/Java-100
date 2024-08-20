import java.util.Scanner;

class p26{
  public static void main(String[] args) {
    int count=0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number to check for prime number : ");
    int n = sc.nextInt();

    if(n>0){
      if(n<=2)
        System.out.println("Entered number is a prime number!");
      else{
        for(int i = 1; i<=Math.sqrt(n); i++)
          if(n%i == 0){
            count++;
            if(n/i != i)
              count++;
          }

        if(count == 2)
          System.out.println("Entered number is a prime number!");
        else
          System.out.println("Entered number is not a prime number!");
      }
    }else
      System.out.println("Number must positive integer!");
    sc.close();
  }
}

// class p26{
//   public static void main(String[] args) {
//     int count=0;
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter a number to check for prime number : ");
//     int n = sc.nextInt();

//     if(n>0){
//       if(n<=2)
//         System.out.println("Entered number is a prime number!");
//       else{
//         for(int i = 1; i<=n; i++)
//           if(n%i == 0)
//             count++;

//         if(count == 2)
//           System.out.println("Entered number is a prime number!");
//         else
//           System.out.println("Entered number is not a prime number!");
//       }
//     }else
//        System.out.println("Number must positive integer!");
//     sc.close();
//   }
// }