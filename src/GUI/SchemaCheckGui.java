package GUI;

import javax.swing.*;


public class SchemaCheckGui {
    JFrame schemaFrame = new JFrame();
    JPanel panel = new JPanel();
    JLabel title = new JLabel("Schema Check");

    public SchemaCheckGui(){
        schemaFrame.setBounds(50, 50, 500, 400);
        schemaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        schemaFrame.setVisible(true);

        panel.setLayout(null);
        schemaFrame.add(panel);

        panel.add(title);
        title.setBounds((schemaFrame.getX() +schemaFrame.getWidth()) / 2 - 70, schemaFrame.getY() - 30, 300, 30);

    }
}
