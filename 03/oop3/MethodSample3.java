public class MethodSample3 {
    //メインメソッド
    public static void main(String[] args) {
        String str = "Hello, Java!!";
        showMessageWithCombine("Hello, World!!", str);
    }
    //画面上に指定された2つのメッセージを,で区切って結合して表示するメソッド
    static void showMessageWithCombine(String message1, String message2) {
        System.out.println(message1 + " , " + message2);
    }
}