import java.util.Scanner;
public class CaseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数値を入力してください (1〜10): ");
        int number = scanner.nextInt();

        if (number >= 1 && number < 5) {
            System.out.println("《メッセージ》5未満の整数" + number + "が入力されました。");
        } else if (number == 5) {
            System.out.println("《メッセージ》5が入力されました。");
        } else if (number > 5 && number <= 10) {
            System.out.println("《メッセージ》6以上の整数" + number + "が入力されました。");
        } 

        scanner.close();
    }
}