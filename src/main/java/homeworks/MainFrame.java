package homeworks;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

  private JPanel contentPane;
  private JButton circleButton;
  File triangleSource = new File("source/Triangle.jfif");
  File circleSource = new File("source/Circle.jfif");
  File squadeSource = new File("source/Squade.jfif");

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MainFrame frame = new MainFrame();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   * 
   * @throws IOException
   */
  public MainFrame() throws IOException {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 300, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);

    JLabel label_1 = new JLabel("");

    JLabel label_2 = new JLabel("");

    JLabel label = new JLabel("Выберите Вашу Фигуру");
    label.setHorizontalAlignment(SwingConstants.CENTER);
    label.setLayout(new BorderLayout());

    JLabel label_3 = new JLabel("");

    JLabel label_4 = new JLabel("");

    JLabel label_5 = new JLabel("");

    JButton triangleButton = new JButton("Треугольник");
    triangleButton.setIcon(new ImageIcon(triangleSource.getCanonicalPath().toString()));
    triangleButton.setHorizontalTextPosition(SwingConstants.CENTER);
    triangleButton.setMinimumSize(new Dimension(10, 10));
    triangleButton.setMaximumSize(new Dimension(40, 40));
    triangleButton.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

    circleButton = new JButton("Круг");
    circleButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {}
    });
    circleButton.setIcon(new ImageIcon("Circle.jfif"));

    JButton button_1 = new JButton("Квадрат");

    JLabel label_6 = new JLabel("");

    JLabel label_7 = new JLabel("");

    JLabel label_8 = new JLabel("");

    JLabel label_9 = new JLabel("");

    JLabel label_10 = new JLabel("");

    JLabel label_11 = new JLabel("");
    GroupLayout gl_contentPane = new GroupLayout(contentPane);
    gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_contentPane.createSequentialGroup().addGap(2).addGroup(gl_contentPane
            .createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
                .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addComponent(label, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addComponent(label_3, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addComponent(label_4, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
            .addGroup(gl_contentPane.createSequentialGroup()
                .addComponent(label_5, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addComponent(triangleButton, GroupLayout.PREFERRED_SIZE, 54,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(circleButton, GroupLayout.PREFERRED_SIZE, 54,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(button_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addComponent(label_6, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
            .addGroup(gl_contentPane.createSequentialGroup()
                .addComponent(label_7, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addComponent(label_8, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addComponent(label_9, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addComponent(label_10, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addComponent(label_11, GroupLayout.PREFERRED_SIZE, 54,
                    GroupLayout.PREFERRED_SIZE)))));
    gl_contentPane
        .setVerticalGroup(
            gl_contentPane
                .createParallelGroup(
                    Alignment.LEADING)
                .addGroup(
                    gl_contentPane
                        .createSequentialGroup().addGap(
                            1)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                            .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 83,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 83,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(label, GroupLayout.PREFERRED_SIZE, 83,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_3, GroupLayout.PREFERRED_SIZE, 83,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_4, GroupLayout.PREFERRED_SIZE, 83,
                                GroupLayout.PREFERRED_SIZE))
                        .addGroup(
                            gl_contentPane.createParallelGroup(Alignment.LEADING)
                                .addComponent(label_5, GroupLayout.PREFERRED_SIZE, 83,
                                    GroupLayout.PREFERRED_SIZE)
                                .addComponent(triangleButton, GroupLayout.PREFERRED_SIZE, 83,
                                    GroupLayout.PREFERRED_SIZE)
                                .addComponent(circleButton, GroupLayout.PREFERRED_SIZE, 83,
                                    GroupLayout.PREFERRED_SIZE)
                                .addComponent(button_1, GroupLayout.PREFERRED_SIZE, 83,
                                    GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_6, GroupLayout.PREFERRED_SIZE, 83,
                                    GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                            .addComponent(label_7, GroupLayout.PREFERRED_SIZE, 83,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_8, GroupLayout.PREFERRED_SIZE, 83,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_9, GroupLayout.PREFERRED_SIZE, 83,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_10, GroupLayout.PREFERRED_SIZE, 83,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_11, GroupLayout.PREFERRED_SIZE, 83,
                                GroupLayout.PREFERRED_SIZE))));
    contentPane.setLayout(gl_contentPane);
  }

  public Icon getCircleButtonIcon() {
    return circleButton.getIcon();
  }

  public void setCircleButtonIcon(Icon icon) {
    circleButton.setIcon(icon);
  }
}
