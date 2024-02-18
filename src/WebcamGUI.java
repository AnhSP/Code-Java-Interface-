import com.github.sarxos.webcam.Webcam;

import javax.swing.*;
import java.awt.*;

public class WebcamGUI extends JFrame {
    private JPanel camPanel;
    private JLabel imageHolder;

    public WebcamGUI(){
        init();
    }

    private void init(){
        this.setTitle("Test");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(camPanel);
        this.setVisible(true);
        turnCam();
    }

    private void turnCam(){
        Webcam webcam= Webcam.getDefault();
        webcam.setViewSize(new Dimension(50,50));
        webcam.open();
        new VideoFeed(webcam, imageHolder).start();
    }
}
