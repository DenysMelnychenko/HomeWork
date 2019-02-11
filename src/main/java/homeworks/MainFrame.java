package homeworks;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame {

  private static final long serialVersionUID = 2577622247034082L;
  private JPanel firstPanel;
  private JPanel secondPanel;
  private JTextField path;

  public MainFrame() {
    super("File Manager");
    firstPanel = new JPanel(new GridLayout(1, 5));
    secondPanel = new JPanel(new BoxLayout(firstPanel, BoxLayout.Y_AXIS));
    path = new JTextField("Enter Path here");
    path.setSize(400, 25);
    JButton show = new JButton("Show");
    show.setSize(100, 20);
    JLabel label = new JLabel();
    firstPanel.setSize(500, 500);
    secondPanel.setSize(500, 500);
    add(firstPanel, BorderLayout.CENTER);
    // add(secondPanel, BorderLayout.CENTER);
    firstPanel.add(path);
    firstPanel.add(show);
    firstPanel.add(label);
    show.addActionListener(e -> label.setText(path.getText()));

    setLayout(new GridLayout(3, 3));
    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
}
