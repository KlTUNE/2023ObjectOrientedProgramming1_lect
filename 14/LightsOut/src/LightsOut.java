import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.Arrays;

public class LightsOut extends JFrame{
    private JPanel panel1;
    private JLabel JLabel0, JLabel1, JLabel2, JLabel3, JLabel4, JLabel5, JLabel6, JLabel7, JLabel8;
    private JLabel[] labels = {JLabel0, JLabel1, JLabel2, JLabel3, JLabel4, JLabel5, JLabel6, JLabel7, JLabel8};
    public void change_label(int index){
        labels[index].setText(String.valueOf((Integer.valueOf(labels[index].getText())+1)%2));
        if (index != 2 && index != 5 && index != 8) labels[index+1].setText(String.valueOf((Integer.valueOf(labels[index+1].getText())+1)%2));
        if (index != 0 && index != 3 && index != 6) labels[index-1].setText(String.valueOf((Integer.valueOf(labels[index-1].getText())+1)%2));
        if (index < 6) labels[index+3].setText(String.valueOf((Integer.valueOf(labels[index+3].getText())+1)%2));
        if (index > 2) labels[index-3].setText(String.valueOf((Integer.valueOf(labels[index-3].getText())+1)%2));
    }
    public void check(){
        int flag = 0;
        for (JLabel label : labels) if (label.getText().equals("0")) flag = 1;
        if (flag == 0){
            javax.swing.JOptionPane.showMessageDialog(panel1, "GameClear!!", "3x3 LightsOut", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            for (JLabel label : labels) label.setText(String.valueOf(new java.util.Random().nextInt(2)));
        }
    }
    public LightsOut() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);
        setContentPane(panel1);

        for (JLabel label : labels) label.setText(String.valueOf(new java.util.Random().nextInt(2)));

        for  (JLabel label : labels){
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    change_label(Arrays.asList(labels).indexOf(label));
                    check();
                }
            });
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {new LightsOut().setVisible(true);});
    }
}