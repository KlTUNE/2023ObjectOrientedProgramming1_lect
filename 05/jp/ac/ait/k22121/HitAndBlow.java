package jp.ac.ait.k22121;
import java.util.Scanner;

public class HitAndBlow {
    public static void main(String[] args){
        Manager app = new Manager();
        Scanner in = new Scanner(System.in);
//        System.out.printf("答え:%s\n",app.getAnswer().get());

        while (true){
            System.out.print("input " + Answer.DIGITS + " numbers :");
            String inputLine = in.nextLine();

            if (Answer.DIGITS != inputLine.length() || !jp.ac.ait.k22121.StringUtilities.isUnsignedInteger(inputLine)){
                System.out.println("入力した値が適切ではありません");
                break;
            }
            Response response = app.solve(inputLine);
            if (response.getHit() == Answer.DIGITS){
                System.out.printf("正解! %d回\n",app.getCount());
                break;
            } else System.out.printf("Hit:%d Blow:%d\n",response.getHit(), response.getBlow());
        }
    }
}
