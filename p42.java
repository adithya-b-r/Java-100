class p42{
  p42(){
    System.out.println("Constructor method is called when an object of it's class is created.");
  }

  public static void main(String args[]){
    staticMethod();
    p42 obj = new p42();
    obj.nonStaticMethod();
  }

  static void staticMethod(){
    System.out.println("Static method can be called without creating an object.");
  }

  void nonStaticMethod(){
    System.out.println("Non-static method can be called only after creating an object.");
  }
}