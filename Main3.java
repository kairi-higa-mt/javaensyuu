class Employee2 {
    private String name;
    private static int employeeCount = 0;
 
    // 引数無しのコンストラクタ
    public Employee2() {
        this.name = "匿名希望";
        //新しい社員が追加されたので人数をインクリメント
        employeeCount++;
    }
 
    // 文字列を引数にもつコンストラクタ
    public Employee2(String name) {
        // 文字列が11文字以上の場合は10文字までに切り捨てる
        if (name.length() > 10) {
            this.name = new StringBuilder(name.substring(0, 10)).toString();
        } else {
            this.name = name;
        }
        //新しい社員が作成されたので社員をインクリメント
        employeeCount++;
    }
    // 名前を出力するメソッド
    public void printName() {
        System.out.println("私はシアトルコンサルティングの社員です。名前は" + this.name + "です。");
    }
    //社員数を出力するメソッド
    public static void printEmployeeCount() {
        System.out.println("社員数は全部で" + employeeCount + "人です。");
    }
}
public class Main3 {
    public static void main(String[] args) {
        // 引数無しのコンストラクタを使用してインスタンス化
        Employee2 employee1 = new Employee2();
        // 名前を出力するメソッドを呼び出す
        employee1.printName();
 
        // 文字列を引数にもつコンストラクタを使用してインスタンス化
        Employee2 employee2 = new Employee2("Pepper");
        // 名前を出力するメソッドを呼び出す
        employee2.printName();
        //社員数を設定して社員数を出力するクラスメソッドを呼び出す
    Employee2.printEmployeeCount();
    }
}