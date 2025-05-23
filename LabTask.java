import javax.swing.*;
import java.awt.*;

public class LabTask {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create the menu bar
        JMenuBar mb = new JMenuBar();

        // Create file and help menus
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");

        // Add menus to menu bar
        mb.add(file);
        mb.add(help);

        // Create menu items
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save As");

        // Add menu items to "File" menu
        file.add(open);
        file.add(save);

        // Add menu bar to frame
        frame.setJMenuBar(mb);

        // Create a panel
        JPanel panel = new JPanel();

        // Create a text area
        JTextArea ta = new JTextArea();

        // Set preferred size and add scroll
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(ta);
        scrollPane.setPreferredSize(new Dimension(350, 300));

        // Add scroll pane to panel
        panel.add(scrollPane);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}








