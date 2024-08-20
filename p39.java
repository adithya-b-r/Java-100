class p39{
  public static void main(String[] args) {
    String s1 = "String split using java";

    String s2[] = s1.split(" ");

    for(String ch: s2)
        System.out.println(ch);
  }
}