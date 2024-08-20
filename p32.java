import java.util.Scanner;

class p32 {
  public static void main(String[] args) {
    int row, col, i, j;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows and columns : ");
    System.out.print("Rows : ");
    row = sc.nextInt();
    System.out.print("Columns : ");
    col = sc.nextInt();

    int mat1[][] = new int[row][col];
    int mat2[][] = new int[row][col];
    int sum[][] = new int[row][col];
    int diff[][] = new int[row][col];

    System.out.print("Enter the elements of first matrix : ");
    for (i = 0; i < row; i++)
      for (j = 0; j < col; j++)
        mat1[i][j] = sc.nextInt();

    System.out.print("Enter the elements of second matrix : ");
    for (i = 0; i < row; i++)
      for (j = 0; j < col; j++)
        mat2[i][j] = sc.nextInt();

    // Sum of mat1 & mat2
    for (i = 0; i < row; i++)
      for (j = 0; j < col; j++)
        sum[i][j] = mat1[i][j] + mat2[i][j];

    // Difference of mat1 & mat2
    for (i = 0; i < row; i++)
      for (j = 0; j < col; j++)
        diff[i][j] = mat1[i][j] - mat2[i][j];

    System.out.println("Sum of first & second matrix : ");
    for (i = 0; i < row; i++){
      for (j = 0; j < col; j++)
        System.out.print(sum[i][j]+" ");
      System.out.println();
    }

    System.out.println("Difference of first & second matrix : ");
    for (i = 0; i < row; i++){
      for (j = 0; j < col; j++)
        System.out.print(diff[i][j]+" ");
      System.out.println();
    }
  }
}