import java.util.Scanner;

public class ScoresManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Score app = new Score();
        String[] subject = {"国語:", "数学:", "理科:", "社会:","英語:"};

        System.out.print("学籍番号:");
        app.id = Integer.parseInt(in.nextLine());
        System.out.print("氏名:");
        app.name = in.nextLine();
        System.out.println("各教科の点数を入力してください。");
        for (int i=0;i<5;i++){
            System.out.print(subject[i]);
            app.subjects[i] = Integer.parseInt(in.nextLine());
        }

        app.printInfo();
    }
}
