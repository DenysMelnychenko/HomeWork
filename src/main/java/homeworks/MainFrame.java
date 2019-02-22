package homeworks;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {

  private static final long serialVersionUID = 2577622247034082L;
  private JPanel firstPanel;

  public MainFrame() {
    super("File Manager");
    add(firstPanel, BorderLayout.CENTER);

    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }


}
