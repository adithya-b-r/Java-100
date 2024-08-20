import java.util.Scanner;

class p34{
  public static void main(String[] args) {
    int m, n, rows, cols;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter dimension for matrix 1 : ");
    System.out.print("Rows : ");
    rows = sc.nextInt(); 
    System.out.print("Cols : ");
    cols = sc.nextInt();

    int mat[][] = new int[rows][cols];
    int transpose[][] = new int[cols][rows];

    System.out.println("Enter values for matrix : ");
    for(m=0; m<rows; m++)
      for(n=0; n<cols; n++)
        mat[m][n] = sc.nextInt();

    for(m=0; m<rows; m++)
      for(n=0; n<cols; n++)
        transpose[n][m] = mat[m][n];

    for(m=0; m<cols; m++){
      for(n=0; n<rows; n++)
        System.out.print(transpose[m][n]+" ");
      System.out.println();
    }

    sc.close();
  }
}