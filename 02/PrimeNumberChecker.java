import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();
        int num = Integer.parseInt(inputLine);

        if (num <=1){
            System.out.println("素数ではありません");
            return;
        }

        for (int count = 2; count <= num-1; count++){
            if (num%count == 0){
                System.out.println("素数ではありません");
                return;
            }
        }

        System.out.println("素数です");

    }
}
