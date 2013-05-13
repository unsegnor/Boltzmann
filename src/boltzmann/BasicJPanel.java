package boltzmann;


import java.awt.*;
import javax.swing.*;

public class BasicJPanel extends JPanel{

  // Create a constructor method
  public BasicJPanel(){
    super();
  }

  // The following methods are instance methods.

  /* Create a paintComponent() method to override the one in
    JPanel.This is where the drawing happens. We don't have 
    to call it in our program, it gets called automatically 
    whenever the panel needs to be redrawn, like when it is 
    made visible or moved or whatever.
  */
  @Override
  public void paintComponent(Graphics g){
    g.drawLine(10,10,150,150); // Draw a line from (10,10) to (150,150)
  }
}