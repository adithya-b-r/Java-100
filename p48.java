class p48{
  String name;
  int num;

  p48(int n){
    num = n;
  }

  p48(String str){
    name = str;
  }

  public static void main(String[] args) {
    p48 objNum = new p48(45);
    p48 objStr = new p48("Java");

    objNum.getNum();
    objStr.getName();
    objStr.setName("Python");
    objStr.getName();
    System.out.println(objStr.getClass());
  }

  void setName(String s){
    name = s;
  }

  void getName(){
    System.out.println("Name : "+name);
  }

  void getNum(){
    System.out.println("Number : "+num);
  }
}