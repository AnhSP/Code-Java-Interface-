import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppView extends JFrame {
    private JButton jButtonMiddle;
    private JLabel startText;
    public AppView() {
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Test");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font= new Font("Arial",Font.BOLD,40);

//        ActionListener ac= new AppController(this);

        jButtonMiddle = new JButton("Start");
//        jButtonMiddle.addActionListener(ac);
        jButtonMiddle.setFont(font);
        jButtonMiddle.setBounds(200,200,200,50);
        this.setLayout(null);
        this.add(jButtonMiddle);
    }
}