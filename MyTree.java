// Allow short name access to java.awt.Color
import java.awt.Color;

/**
 * The purpose of this assignment is to create a scene and manipulate it.
 * 
 * Grading Rubric: Challenge
 * 
 * @author Sean Bucholtz
 * @version Assignment 4: Scene Creation
 */
public class MyTree extends NsccComponent {
  
  // instance variables
  private NsccRectangle trunk;
  private NsccUpTriangle leaves;
  protected Color COLOR = new Color(36,106,46);
  
  /**
   * zero-parameter constructor for objects of class MyTree.
   * This creates a MyTree instance at location (0,0).
   */
  public MyTree() {
   this(0,0);
  }
  
  /**
   * Constructor for objects of class MyTree.
   * This creates a MyTree instance at the specified location.
   * 
   * @param x the x-coordinate for the object.
   * @param y the y-coordinate for the object.
   */
  public MyTree(int x, int y) {
   super(x,y,90,120);
   trunk = new NsccRectangle(35,90,20,30);
   trunk.setBackground(new Color(85,53,10));
   trunk.setFilled(true);
   this.add(trunk);
   leaves = new NsccUpTriangle(0,0,90,91);
   leaves.setBackground(COLOR);
   leaves.setFilled(true);
   this.add(leaves);
  }
  
  /**
   * Constructor for objects of class MyTree.
   * This creates a MyTree instance at the specified location,
   * and colors the leaves with the specified color.
   * 
   * @param x the x-coordinate for the object.
   * @param y the y-coordinate for the object.
   * @param c the color of the leaves.
   */
  public MyTree(int x, int y, java.awt.Color c) {
   super(x,y,90,120);
   trunk = new NsccRectangle(35,90,20,30);
   trunk.setBackground(new Color(85,53,10));
   trunk.setFilled(true);
   this.add(trunk);
   leaves = new NsccUpTriangle(0,0,90,91);
   leaves.setBackground(c);
   leaves.setFilled(true);
   this.add(leaves);
  }
  
   /**
   * Changes the color of the tree leaves.
   * 
   * @param c The color for the leaves.
   */
  public void setColor(Color c) {
   leaves.setBackground(c);
   repaint();
  }
  
  /**
   * Retrieves the color of the tree leaves.
   * 
   * @return The color of the leaves.
   */
  public java.awt.Color getColor() {
    
   return leaves.getBackground(); 
  }
  
  /**
   * Changes the size of the tree.
   * 
   * @param w The width of the tree.
   * @param h The height of the tree.
   */
  public void setSize(int w, int h) {
    
   super.setSize(w, h);
   trunk.setSize((int)(w*0.2), (int)(h*0.25));
   trunk.setLocation((int)(w*0.389), (int)(h*0.75));
   leaves.setSize(w, (int)(h*0.7583));
   leaves.setLocation(0, 0);
   repaint();
  }
}