package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PgrfFrame extends JFrame {

    private BufferedImage img;
    static int width = 800;
    static int height = 600;

    public void main(String... args ) {
        PgrfFrame pgrfFrame = new PgrfFrame();
        pgrfFrame.img = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        pgrfFrame.init(width,height);

        private void init(int width, int height) {
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setVisible(true);
            setSite(width,height);
            setTitle("Počítačová grafika");

            draw();
        }

        private void draw()  {
          img.getGraphics().fillRect(x:0, y:0, img.getWidth(), img.getHeight());
            for (int i = 0; i < 100; i++) {
                img.setRGB(x:200 + 1, y:200, Color.RED.getRGB());
            }
            getGraphics().drawImage(img, x:0, y:0, img.getWidth(), img.getHeight(), observer:null);
        }
        }


    }
