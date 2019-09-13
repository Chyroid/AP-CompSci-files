/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 //Leo Rollman
package litvinrainbow;

/**
 *
 * @author GandenTSchaffner
 * Litvin pg171 Rainbow
 * October 6, 2015
 */
import java.awt.*;
import javax.swing.*;

public class LitvinRainbow extends JApplet {
    // Declare skyColor
    private final Color skyColor = Color.cyan;

    @Override
    public void init() {
        Container c = getContentPane();
        c.setBackground(skyColor);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Container c = getContentPane();
        int width = c.getWidth();
        int height = c.getHeight();

        //  Declare and initialize integer variables xCenter, yCenter
        //  that represent the center of the rainbow rings
        int xCenter = (int)(width / 2.0);
        int yCenter = (int)(height * 2.0 / 3.0);

        //  Declare and initialize the radius of the large semicircle
        int largeRadius = (int)(width / 4.0);

        g.setColor(Color.red);

        // Draw the large semicircle:
        // g.fillArc( ... );
        g.fillArc(xCenter - largeRadius, yCenter - largeRadius,
                largeRadius * 2, largeRadius * 2, 0, 180);

        // Declare and initialize the radii of the small and medium
        // semicircles and draw them
        int smallRadius = (int)(height / 4.0);
        int mediumRadius = (int)(Math.sqrt(smallRadius * largeRadius) + 0.5);
        
        g.setColor(Color.green);
        g.fillArc(xCenter - mediumRadius, yCenter - mediumRadius, 
                mediumRadius * 2, mediumRadius * 2, 0, 180);
        g.setColor(Color.magenta);
        g.fillArc(xCenter - smallRadius, yCenter - smallRadius, 
                smallRadius * 2, smallRadius * 2, 0, 180);

        // Calculate the radius of the innermost (sky-color) semicircle
        // so that the width of the middle (green) ring is the
        // arithmetic mean of the widths of the red and magenta rings.
        // Draw the sky-color semicircle.
        int skyRadius = (int)((largeRadius - (3 * mediumRadius) + 
                (3 * smallRadius)) + 0.5);
        g.setColor(skyColor);
        g.fillArc(xCenter - skyRadius, yCenter - skyRadius, 
                skyRadius * 2, skyRadius * 2, 0, 180);
    }
}