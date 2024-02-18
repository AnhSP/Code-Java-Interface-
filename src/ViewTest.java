import javax.swing.*;
import java.awt.event.ActionListener;

public class ViewTest extends JFrame {
    private JPanel panel1;
    private JButton startButton;

    public ViewTest() {
        this.setTitle("Test");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        init();
        this.setVisible(true);
    }

    private void init(){
        this.setContentPane(panel1);
        ActionListener ac= new AppController(this);
        startButton.addActionListener(ac);
    }
}
