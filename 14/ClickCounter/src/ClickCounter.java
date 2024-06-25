import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClickCounter extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton resetButton;
    private JLabel counter;
    private int count;

    public ClickCounter(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 100);
        setContentPane(panel1);

        counter.setText("0");

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = 0;
                counter.setText(String.valueOf(count));
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count --;
                counter.setText(String.valueOf(count));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count ++;
                counter.setText(String.valueOf(count));
            }
        });
    }

    public static void main(String[] args) {
        // イベントキューに画面の起動スレッドを追加
        EventQueue.invokeLater(() -> {
            new ClickCounter().setVisible(true);
        });
    }
}
