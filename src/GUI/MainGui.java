package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class MainGui {
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
    JButton b1, b2, b3, b4, b5, b6;
    JLabel title = new JLabel("INTERVIEW DATABASE");

    public MainGui(){
        guiInit();
    }

    public void guiInit(){
        frame.setBounds(50, 50, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel1.setLayout(null);
        frame.add(panel1);

        panel1.add(title);
        title.setBounds((frame.getX() +frame.getWidth()) / 2 - 100, frame.getY(), 300, 30);
        int btWidth = 200;
        int btHeight = 30;
        int btFirstLineX = (frame.getX() +frame.getWidth()) / 2 - btWidth - 60;
        int btSecondLineX = (frame.getX() +frame.getWidth()) / 2 + 30;
        int btFirstLineY = (frame.getY() + frame.getHeight()) - 300;
        int btHGap = 25;
        panel1.add(b1 = new JButton("Schema check"));
        b1.setBounds(btFirstLineX, btFirstLineY, btWidth, btHeight);
        panel1.add(b2 = new JButton("Custom Query"));
        b2.setBounds(btSecondLineX, btFirstLineY, btWidth, btHeight);
        panel1.add(b3 = new JButton("Select Query"));
        b3.setBounds(btFirstLineX, btFirstLineY + btHeight + btHGap, btWidth, btHeight);
        panel1.add(b4 = new JButton("Insert Query"));
        b4.setBounds(btSecondLineX, btFirstLineY + btHeight + btHGap, btWidth, btHeight);
        panel1.add(b5 = new JButton("Delete Query"));
        b5.setBounds(btFirstLineX, btFirstLineY + btHeight * 2 + 2 * btHGap, btWidth, btHeight);
        panel1.add(b6 = new JButton("Update Query"));
        b6.setBounds(btSecondLineX, btFirstLineY + btHeight * 2 + 2 * btHGap, btWidth, btHeight);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SchemaCheckGui();
            }
        });
    }
}
