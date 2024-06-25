package jp.ac.ait.k22121;

import java.util.Scanner;

public class Kadai2 extends PasswordManager{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws PasswordRulesViolationException {
        //PasswordManager p = new PasswordManager();

        System.out.print("パスワードを入力してください > ");
        String input = sc.nextLine();
        try {
            PasswordManager.validate(input);
        }
        catch (Exception e){
            System.out.printf("パスワードのルール基準を満たしていません。%s\n", e.getMessage());
        }
        System.out.printf("パスワード : %s\n", input);
    }
}