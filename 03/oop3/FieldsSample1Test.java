public class FieldsSample1Test {
    // エントリポイント
    public static void main(String[] args) {

        // FieldsSample1クラスを変数として使えるように初期化
        FieldsSample1 data = new FieldsSample1();

        // いったん出力してみる
        System.out.println(data.name);
        System.out.println(data.height);
        System.out.println(data.weight);

        FieldsSample1 data2 = new FieldsSample1();

        data2.name = "こじろう";     // 名前を入れ替え
        data2.height = 165.0f;      // 身長を差し替え
        data2.weight = 78.0f;       // 体重を差し替え

        System.out.println(data2.name);
        System.out.println(data2.name.length()); // 名前の長さを表示したい
        System.out.println(data2.height);
        System.out.println(data2.weight);
    }
}