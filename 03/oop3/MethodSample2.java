public class MethodSample2 {
    //メインメソッド
    public static void main(String[] args) {
        showAnyMessage("Hello, ");

        String str = "World!!";
        showAnyMessage(str);
    }
    //画面上に指定されたメッセージを表示するメソッド
    static void showAnyMessage(String message) {
        System.out.println(message);
    }
}