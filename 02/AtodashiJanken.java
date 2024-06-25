import java.util.Scanner;

public class AtodashiJanken {
    public static void main(String[] args) {
        // 変数には、0から3未満のint型の整数値がランダムで格納されます。
        int randomNumber = new java.util.Random().nextInt(3);

        // ↑と同じだけど違う書き方。複数ランダムな値を取得したい場合に使ってください。
        // rnd.nextInt(3)で0〜2のランダムな値を取得できます。
        //java.util.Random rnd = new java.util.Random();
        //int randomNumber = rnd.nextInt(3);

        // 確認用
//        System.out.println(randomNumber);
        if (randomNumber == 0){
            System.out.println("コンピュータ:グー");
        } else if (randomNumber == 1) {
            System.out.println("コンピュータ:チョキ");
        } else {
            System.out.println("コンピュータ:パー");
        }

        System.out.println("何を出しますか？ (0:グー,1:チョキ,2:パー)");
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();
        int num = Integer.parseInt(inputLine);

        if (num >2 || num <0){
            System.out.println("あなたの出した手が判断できません。勝負はしません。");
            return;
        }
        if (num == randomNumber){
            System.out.println("あいこ");
        } else if (randomNumber == 0 && num == 2){
            System.out.println("勝ち");
        } else if (randomNumber == 1 && num == 0){
            System.out.println("勝ち");
        } else if (randomNumber == 2 && num == 1){
            System.out.println("勝ち");
        } else {
            System.out.println("負け");
        }
    }
}
