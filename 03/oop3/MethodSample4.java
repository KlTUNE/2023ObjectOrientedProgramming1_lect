public class MethodSample4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ":");

            String str = getMessage(i);
            System.out.println(str);

            //上記2行を以下のように書いてもOKです
            //System.out.println(getMessage(i));
        }
    }
    static String getMessage(int number) {
        switch (number) {
            case 1:
                return "Hello, World!!";
            //return文で、このメソッドの処理自体が終了するため、breakは必要ありません。
            case 2:
                return "Hello, Java!!";
            case 3:
                return "Hello, Everyone!";
            default:
                //1,2,3以外の番号が指定された場合
                return "There is no message specified number.";
        }
        //上記switch文ですべてのパターンのときにreturnしているため、ここまで処理は来ません。
    }
}