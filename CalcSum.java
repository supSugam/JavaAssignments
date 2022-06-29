package Week19.Tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CalcSum implements ActionListener {

    int num1;
    int num2;
    int sum;
    JFrame frame = new JFrame("CalcSum+");
    FlowLayout flowLayout;
    JPanel panel = new JPanel();
    JTextField tf1 = new JTextField(15);
    JTextField tf2 = new JTextField(15);

    JButton button = new JButton("Click ME to Get SUM!");


    JLabel label = new JLabel("The Sum is: "+ sum);

//    GridBagLayout gc = new GridBagLayout();



    public CalcSum() {
        tf1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tf1.setText("Number only");
            }
            @Override
            public void focusLost(FocusEvent e) {
                tf1.setText("Number only");
                if (tf1.getText().isEmpty()) {
                    tf1.setForeground(Color.GRAY);
                    tf1.setText("Number only");
                }
            }
        });
        flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.CENTER);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("C:/Users/sugam/OneDrive/Pictures/count.png");
        frame.setIconImage(image.getImage());

        label.setForeground(Color.YELLOW);

//        panel.setLayout(flowLayout);
        panel.setLayout(flowLayout);
        panel.add(tf1);
        panel.add(tf2);
        panel.add(button);
        panel.add(label, JLabel.BOTTOM);
        panel.setBackground(new Color(30,30,30));
        panel.setForeground(Color.WHITE);
        frame.add(panel);

        label.setFont(new Font("Roboto", Font.BOLD, 40));

        button.addActionListener(this);
}
    public void actionPerformed(ActionEvent e) {
        try {
            num1 = Integer.parseInt(tf1.getText());
            num2 = Integer.parseInt(tf2.getText());
            sum = num1 + num2;
            label.setText("The Sum is: " + sum);
        } catch (Exception ex){
            label.setText("Invalid Type of Input");
        }
    }
    public static void main(String[] args) {
        new CalcSum();
    }
}