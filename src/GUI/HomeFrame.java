package GUI;

import javax.swing.*;
import java.awt.*;

public class HomeFrame {

    JFrame homeFrame;
    HomeFrame(){
        homeFrame = new JFrame("Password Strength Checker");
        homeFrame.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel();
        titleLabel.setText("Password Strength Checker");

        titlePanel.add(titleLabel);
    }
}
