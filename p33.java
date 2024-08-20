import java.util.Scanner;

class p33{
  public static void main(String[] args) {
    int m, n, k, col1, row1, col2, row2, sum=0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter dimension for matrix 1 : ");
    System.out.print("Rows : ");
    row1 = sc.nextInt();
    System.out.print("Columns : ");
    col1 = sc.nextInt();

    int mat1[][] = new int[row1][col1];

    System.out.println("Enter dimension for matrix 2 : ");
    System.out.print("Rows : ");
    row2 = sc.nextInt();
    System.out.print("Columns : ");
    col2 = sc.nextInt();

    int mat2[][] = new int[row2][col2];
    int result[][] = new int[row1][col2];

    if(row1 != col2)
      System.out.println("Invalid matrix dimension!");
    else{
      System.out.println("Enter elements for matrix 1 : ");
      for(m=0; m<row1; m++)
        for(n=0; n<col1; n++)
          mat1[m][n] = sc.nextInt();

      System.out.println("Enter elements for matrix 2 : ");
      for(m=0; m<row2; m++)
        for(n=0; n<col2; n++)
          mat2[m][n] = sc.nextInt();

      for(m=0; m<row1; m++)
        for(n=0; n<col2; n++){
          for(k=0; k<row2; k++)
            sum += mat1[m][k] * mat2[k][n];
          result[m][n] = sum;
          sum = 0;
        }
    }

    System.out.println("Product of matrix 1 and 2 : ");
    for(m=0; m<row1; m++){
      for(n=0; n<col2; n++)
        System.out.print(result[m][n]+" ");
      System.out.println();
    }

    sc.close();
  }
}