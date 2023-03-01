package JavaDesktopAppDev.timer;

import javax.swing.*;
import java.awt.*;

public class TimerApp {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Timer App");
        JButton settingsBtn = new JButton("Settings");
        JButton closeBtn = new JButton("Close");
        mainFrame.add(settingsBtn);
        mainFrame.add(closeBtn);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setSize(300, 100);

        JFrame settingsFrame = new JFrame("Timer Settings");
        JLabel onTimeLabel = new JLabel("On time:");
        JLabel countdownLabel = new JLabel("Countdown:");
        JLabel chooseColorLabel = new JLabel("Choose color:");
        String[] colors = {"Red", "Blue", "Green", "Yellow"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        JTextField countdownField = new JTextField(10);
        JSlider speedSlider = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);

        settingsFrame.add(onTimeLabel);
        settingsFrame.add(countdownLabel);
        settingsFrame.add(chooseColorLabel);
        settingsFrame.add(colorComboBox);
        settingsFrame.add(countdownField);
        settingsFrame.add(speedSlider);
        settingsFrame.setLayout(new GridLayout(3, 2));
        settingsFrame.setSize(300, 150);
        settingsFrame.setVisible(false);

        settingsBtn.addActionListener(e -> settingsFrame.setVisible(true));
        closeBtn.addActionListener(e -> System.exit(0));

        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

