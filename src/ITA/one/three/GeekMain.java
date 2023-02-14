package ITA.one.three;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.*;

public class GeekMain {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GeekMain::createAndShowGUI);

    }

    private static void createAndShowGUI(){
        JFrame frame = new JFrame();
        frame.setTitle("Geek Panel with Item Listener");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel geekPanel = new GeekPanel();
        frame.setContentPane(geekPanel);
        frame.setMinimumSize(new Dimension(500, 400));
        frame.setVisible(true);

    }
}
