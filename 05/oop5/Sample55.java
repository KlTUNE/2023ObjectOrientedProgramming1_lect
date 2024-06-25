import java.util.Scanner;

public class Sample55 {

    public static void main(String[] args) {
        System.out.println("文字列を入力してください。");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println("１文字ずつ表示します。");
        // 拡張forを使って1文字ずつ取り出して処理する
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }
}