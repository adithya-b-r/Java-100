import java.util.Scanner;

class p12{
  public static void main(String[] args) {
    int marks;
    char grade;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your marks : ");
    marks = sc.nextInt();

    if(marks >= 35){
      if(marks > 90)
        grade = 'A';
      else if(marks > 75)
        grade = 'B';
      else if(marks > 60)
        grade = 'C';
      else
        grade = 'D';
    }else{
      grade = 'F';
    }

    System.out.println("Obtained marks : "+marks+"\nGrade : "+grade);
    sc.close();
  }
}