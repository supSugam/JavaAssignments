package Week19.Tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CounterDisplay implements ActionListener{

    int counter=0;
    JPanel panel = new JPanel();

    JButton button = new JButton("Click ME to Increase Value!");
    JFrame frame = new JFrame("Display Counter");
    JLabel label = new JLabel(""+counter);
    BorderLayout layout = new BorderLayout();

    public CounterDisplay() {

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("C:/Users/sugam/OneDrive/Pictures/count.png");
        frame.setIconImage(image.getImage());


        panel.setLayout(layout);
        panel.add(button,BorderLayout.LINE_END);
        panel.add(label,BorderLayout.CENTER);
        panel.add(new Label("Week 19 - Tutorial"),BorderLayout.PAGE_END);
        panel.setBackground(new Color(25,25,25));
        frame.add(panel);

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.YELLOW);
        label.setFont(new Font("Roboto", Font.BOLD, 200));
        button.addActionListener(this);
        button.setBackground(Color.YELLOW);
        button.setForeground(Color.BLACK);
    }

    public void actionPerformed(ActionEvent e) {
            counter++;
            label.setText(""+ counter);
    }

    public static void main(String[] args) {
        new CounterDisplay();
    }

}