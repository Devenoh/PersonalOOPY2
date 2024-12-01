/*
*LaunchPage.java
@author Aaron Tracey
*16/11/2024
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    /*public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        panel.setLayout(new GridLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }*/
    JFrame frame = new JFrame();
    JButton domesticButton = new JButton("Domestic Login");
    JButton commercialButton = new JButton("Commercial Login");
    JButton financialButton = new JButton("Financial Login");

    JLabel titleLabel = new JLabel("Hunger App");
    LoginStorage loginStorage = new LoginStorage();

    LaunchPage() {
        domesticButton.setBounds(100, 160, 200, 40);
        domesticButton.setFocusable(true);
        domesticButton.addActionListener(this);
        frame.add(domesticButton);

        commercialButton.setBounds(100, 220, 200, 40);
        commercialButton.setFocusable(true);
        commercialButton.addActionListener(this);
        frame.add(commercialButton);

        financialButton.setBounds(100, 280, 200, 40);
        financialButton.setFocusable(true);
        financialButton.addActionListener(this);
        frame.add(financialButton);

        titleLabel.setBounds(97, 60, 250, 60);
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 36));
        frame.add(titleLabel);

        frame.setTitle("Hunger App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(domesticButton)) {
            System.out.println("domestic");
            loginStorage.setDomestic(true);
            RecipesLaunchPage recipesLaunchPage = new RecipesLaunchPage();
        } else if (e.getSource().equals(commercialButton)) {
            System.out.println("commercial");
            loginStorage.setCommercial(true);
        } else if (e.getSource().equals(financialButton)) {
            System.out.println("financial");
            loginStorage.setFinancial(true);}
    }
}
