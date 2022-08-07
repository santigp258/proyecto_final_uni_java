package Clases;

import javax.swing.JOptionPane;

public class Messages {
    public static void error(String title, String desc) {
        JOptionPane.showMessageDialog(null, desc,
                title, JOptionPane.ERROR_MESSAGE);
    }
    
     public static void info(String title, String desc) {
        JOptionPane.showMessageDialog(null, desc,
                title, JOptionPane.INFORMATION_MESSAGE);
    }
}
