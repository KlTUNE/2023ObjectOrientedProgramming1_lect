import java.util.Scanner;

public class 	Multiplication100 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String inputLine = in.nextLine();
    int num = Integer.parseInt(inputLine);
    System.out.println("計算結果：" + num*100);
    in.close();
  }
}