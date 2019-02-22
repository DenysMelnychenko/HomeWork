package homeworks;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class FirstScreenPanel extends JPanel {

  private static final long serialVersionUID = -8528325768185975389L;
  private JPanel secondPanel;
  private JTextField path;
  private JList<Object> listOfFile;


  public FirstScreenPanel() {
    JPanel firstPanel = new JPanel(new BorderLayout());
    JTextField path = new JTextField("");
    path.setSize(400, 25);
    JButton show = new JButton("Open");
    show.setSize(100, 20);
    firstPanel.setSize(500, 500);

    firstPanel.add(path, BorderLayout.NORTH);
    firstPanel.add(show, BorderLayout.AFTER_LAST_LINE);
    show.addActionListener(e -> {
      showListOfFiles();
    });
  }

  private void showListOfFiles() {
    DefaultListModel<Object> dfm = new DefaultListModel<>();
    this.listOfFile = new JList<Object>(dfm);
    JScrollPane scrollPanelList = new JScrollPane(listOfFile);
    scrollPanelList.setPreferredSize(new Dimension(250, 500));
    listOfFile.setLayoutOrientation(JList.VERTICAL);
    File files = new File(path.getText());
    listOfFile.setListData(files.list());
    this.remove(scrollPanelList);
    revalidate();
    repaint();
    new BorderLayout();
    this.add(scrollPanelList, BorderLayout.CENTER);
    // this.add(firstPanel);
    this.setVisible(true);
  }
}
