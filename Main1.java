 class ClassPra {
    void sameName() {
        System.out.println("引数を持たないsameNameメソッドです");
    }
    void sameName(int arg1) {
        System.out.println("int型の引数を1つもつsameNameメソッドです。引数:" + arg1);
    }
   
    void sameName(int arg1, int arg2) {
        System.out.println("int型の引数を2つもつsameNameメソッドです。引数:" + arg1 + ", " + arg2);
    }
   
    void sameName(String arg1) {
        System.out.println("String型の引数を1つもつsameNameメソッドです。引数: " + arg1);
    }
   
    void sameName(String arg1, String arg2) {
        System.out.println("String型の引数を2つもつsameNameメソッドです。引数: " + arg1 + ", " + arg2);
    }
  }
   
  public class Main1{
    public static void main(String[] args){
        ClassPra myObj = new ClassPra();
        myObj.sameName();
        myObj.sameName(0);
        myObj.sameName(0, 1);
        myObj.sameName("str1");
        myObj.sameName("str1", "str2");
    }
  }
