class p36{
  public static void main(String args[]){
    String s1 = "Hello, from Java!";

    System.out.println(s1.endsWith("Java"));
    System.out.println(s1.endsWith("ava!"));
    System.out.println(s1.endsWith("!"));

    System.out.println(s1.startsWith("h"));
    System.out.println(s1.startsWith("Hel"));
    System.out.println(s1.startsWith("Hello"));

  }
}