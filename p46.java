class p46{
  p46(){
    System.out.println("Constructer of class p46.");
  }

  void p46Method(){
    System.out.println("Hello from class p46.");
  }

  public static void main(String[] args) {
    p46 objp46 = new p46();
    anotherClass objAnotherClass = new anotherClass();

    objp46.p46Method();
    objAnotherClass.printSomething();
  }
}

class anotherClass{
 anotherClass(){
  System.out.println("Constructer of class anotherClass.");
 }

 void printSomething(){
  System.out.println("Hello from anotherClass");
 }
}