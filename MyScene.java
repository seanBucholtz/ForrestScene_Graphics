// Allow short name access to java.awt.Color
import java.awt.Color;

/**
 * This is the shell for programming assignment 3.
 * This program draws a simple scene using additional
 * classes that the student creates.
 * 
 * @author Dan Jinguji 
 * @version Assignment 4: MyScene
 */
public class MyScene extends NsccWindow {

  // instance variables
  private MyHouse house1;
  private MyHouse house2;
  private MyHouse house3;
  private MyHouse house4;
  private MyTree tree1;
  private MyTree tree2;
  private MyTree tree3;
  private MyTree tree4;
  
  /**
   * Constructor for objects of class MyScene
   */
  public MyScene() {
    // Specify the constructor for the superclass
    super(10, 10, 400, 300);
    // set characteristics for the object
    setTitle("My Scene");
    
    // Draw the sky
    getContentPane().setBackground(new Color(0x00, 0xCC, 0xFF));
    
    // Draw some grass
    NsccRectangle grass = new NsccRectangle(0, 100, 400, 200);
    grass.setBackground(new Color(0x00, 0x99, 0x00));
    grass.setFilled(true);
    add(grass);
     
    // Draw trees
    tree1 = new MyTree(60,-10);
    add(tree1);
    tree2 = new MyTree(0,0,Color.magenta);
    add(tree2);
    tree3 = new MyTree(280,5,Color.yellow);
    add(tree3);
    tree4 = new MyTree(220,10);
    add(tree4);
    
    // Draw houses
    house1 = new MyHouse(100, 50);
    add(house1);
    house2 = new MyHouse(280, 95, Color.red);
    add(house2);
    house3 = new MyHouse(5, 115, Color.white);
    add(house3);
    house4 = new MyHouse(170, 160);
    add(house4);
   
  }
  
  /**
   * Alter the scene, by changing color
   */
  public void change1(Color c) {
    // change the color of the tree
    tree1.setColor(c);
    tree2.setColor(c);
    tree3.setColor(c);
    tree4.setColor(c);
    // change the color of the house
    house1.setColor(c);
    house2.setColor(c);
    house3.setColor(c);
    house4.setColor(c);
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, by changing location
   */
  public void change2() {
    // change the location of the tree
    tree1.setLocation(150,130);
    tree2.setLocation(120,0);
    tree3.setLocation(300,15);
    tree4.setLocation(0,140);
    // change the location of the house
    house1.setLocation(270, 130);
    house2.setLocation(60, 165);
    house3.setLocation(200, 50);
    house4.setLocation(10, 55);
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, by changing size
   */
  public void change3() {
    // change the size of the houses
    house1.setSize(80, 60);
    house2.setSize(100, 80);
    house3.setSize(60, 40);
    house4.setSize(140, 110);
    // change the size of the tress
    tree1.setSize(45,60);
    tree2.setSize(110,140);
    tree3.setSize(85, 160);
    tree4.setSize(75,105);
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, restoring original settings
   */
  public void reset() {
    // reset the initial values for the trees
    tree1.setLocation(60,-10);
    tree1.setColor(tree1.COLOR);
    tree2.setLocation(0,0); 
    tree2.setColor(Color.magenta);
    tree3.setLocation(280,5);
    tree3.setColor(Color.yellow);
    tree4.setLocation(220,10);
    tree3.setColor(new Color(36,106,46));
    
    // reset the initial values for the houses
    house1.setLocation(100, 50);
    house1.setColor(Color.blue);
    house1.setSize(120, 90); // 
    house2.setLocation(280, 95);
    house2.setColor(Color.red);
    house3.setLocation(5, 115);
    house3.setColor(Color.white);
    house4.setLocation(170, 160);
    house4.setColor(Color.blue);
    
     // change the size of the houses
    house1.setSize(120, 90);
    house2.setSize(120, 90);
    house3.setSize(120, 90);
    house4.setSize(120, 90);
    
    // change the size of the tress
    tree1.setSize(90,120);
    tree2.setSize(90,120);
    tree3.setSize(90,120);
    tree4.setSize(90,120);
    
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * The application method, to test your code
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {

     // declare a MyScene reference
     MyScene aScene;
     // instantiate MyScene
     aScene = new MyScene();
     // pause
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setColor
     aScene.change1(Color.orange);
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setLocation
     aScene.change2();
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setSize
     aScene.change3();
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // reset initial values
     aScene.reset();
  }
  
}
