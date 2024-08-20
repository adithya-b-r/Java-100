class p44{
  public static void main(String[] args) {
    System.out.println("Main method is executed!");
  }
  static{
    System.out.println("Static block is executed before main method!");

    String os = System.getenv("OS");
    if(os.equals("Windows_NT") != true){
      System.exit(1);
    }
  }
}