import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberQuiz extends JFrame {
    private JTextField textField1;
    private JPanel panel1;
    private JButton Button;
    private JLabel label;
    private Random rnd = new Random();
    private int n = 0;
    private int flag = 0;
    private int rand = 0;
    private int answer = 0;
    public NumberQuiz() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 200);
        setContentPane(panel1);
        rand = rnd.nextInt(100000);
        System.out.println(rand);

        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (char s : textField1.getText().toCharArray()) {
                    if (Character.isDigit(s)){
                        flag = 0;
                    }
                    else {
                        label.setText("整数値を入力してください");
                        flag = 1;
                        break;
                    }
                }

                if (answer == 1) {
                    textField1.setText("");
                    label.setText("ランダムに決定した5桁の整数値を当てましょう");
                    rand = rnd.nextInt(100000);
                    System.out.println(rand);
                    Button.setText("チェック");
                    answer = 0;
                    flag = 1;
                    n = 0;
                }

                if (!textField1.getText().equals("") && flag == 0){
                    int num = Integer.parseInt(textField1.getText());
                    n ++;
                    if (rand == num){
                        label.setText("正解" + "(試行回数:" + n + "回)");
                        Button.setText("リセット");
                        answer = 1;
                    }
                    else if (rand-num >= 10000){
                        label.setText("それよりもっともっと大きい" + "(試行回数:" + n + "回)");
                    }
                    else if (rand-num >= 1000){
                        label.setText("それよりもっと大きい" + "(試行回数:" + n + "回)");
                    }
                    else if (rand-num > 0){
                        label.setText("それより大きい" + "(試行回数:" + n + "回)");
                    }
                    else if (num-rand >= 10000){
                        label.setText("それよりもっともっと小さい" + "(試行回数:" + n + "回)");
                    }
                    else if (num-rand >= 1000){
                        label.setText("それよりもっと小さい" + "(試行回数:" + n + "回)");
                    }
                    else if (num-rand > 0){
                        label.setText("それより小さい" + "(試行回数:" + n + "回)");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new NumberQuiz().setVisible(true);
        });
    }
}
