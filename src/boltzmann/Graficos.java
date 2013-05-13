/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boltzmann;

import javax.swing.JFrame;

/**
 *
 * @author Víctor
 */
public class Graficos {
    
    public static void muestra(Red red){
        
    JFrame frame = new JFrame("BasicJPanel");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,200);

    // Create a new identifier for a BasicJPanel called "panel",
    // then create a new BasicJPanel object for it to refer to.
    BasicJPanel panel = new BasicJPanel();

    // Make the panel object the content pane of the JFrame.
    // This puts it into the drawable area of frame, and now
    // we do all our drawing to panel, using paintComponent(), above.
    frame.setContentPane(panel);
    frame.setVisible(true);
        
    }
    
}
