import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class AddressBook extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    private JButton saveButton;
    private JList list1;
    private JScrollPane panel2;
    private DefaultListModel model;
    private String line = "", output_file = "[";
    private List<String> jsons = new ArrayList<>();

    private AddressBook(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);
        setContentPane(panel1);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                line = "{" + "\"name\"" + ":" + "\"" +textField1.getText() + "\"" + "," +
                        "\"phoneNumber\"" + ":" + "\"" + textField2.getText() + "\"" + "}";
                jsons.add(line);
                System.out.println(line);

                model = new DefaultListModel();
                for (String json : jsons) model.addElement(json.substring(9, json.indexOf("\",\"")) + ":" + json.substring(json.indexOf("\",\"")+17,json.length()-2));

                list1.setModel(model);
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int flag = 0;
                for (String json : jsons){
                    if (flag == 0) {
                        output_file += json;
                        flag = 1;
                    }
                    else output_file += "," + json;
                }
                output_file += "]";

                JFileChooser filechooser = new JFileChooser();

                int selected = filechooser.showSaveDialog(panel1);
                if (selected == JFileChooser.APPROVE_OPTION){
                    try{
                        FileWriter filewriter = new FileWriter(filechooser.getSelectedFile());
                        filewriter.write(output_file);
                        filewriter.close();
                    }catch(Exception ee){
                        System.out.println(ee);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new AddressBook().setVisible(true));
    }
}