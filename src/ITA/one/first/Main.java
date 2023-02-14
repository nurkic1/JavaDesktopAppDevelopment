package ITA.one.first;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = Main::showGUI;

        SwingUtilities.invokeLater(runnable);


    }

    static void showGUI(){
        System.out.println(Thread.currentThread().getName());
        JFrame frame = new JFrame();
        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);
        frame.setTitle("Naslov mog prozora");
        frame.setSize(500, 400);

        ButtonPanel buttonPanel = new ButtonPanel();
        frame.setContentPane(buttonPanel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
