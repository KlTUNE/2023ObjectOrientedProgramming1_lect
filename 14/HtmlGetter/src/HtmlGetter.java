import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HtmlGetter extends JFrame{
    private JPanel panel1;
    private JTextField url;
    private JButton get;
    private JButton save;
    private JTextArea html;
    private String input_url = "", line = "", output_html = "";

    public HtmlGetter(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);
        setContentPane(panel1);

        get.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_url = url.getText();

                try {
                    URL url = new URL(input_url);
                    URLConnection connection = url.openConnection();

                    try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                        while ((line = in.readLine()) != null) output_html += line + "\n";
                    }
                    catch (Exception ee){
                        System.out.println(ee);
                    }
                }
                catch (Exception ee){
                    System.out.println(ee);
                }

                html.setText(output_html);
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser filechooser = new JFileChooser();

                int selected = filechooser.showSaveDialog(panel1);
                if (selected == JFileChooser.APPROVE_OPTION){
                    try{
                        FileWriter filewriter = new FileWriter(filechooser.getSelectedFile());
                        filewriter.write(output_html);
                        filewriter.close();
                    }catch(Exception ee){
                        System.out.println(ee);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new HtmlGetter().setVisible(true));
    }
}
