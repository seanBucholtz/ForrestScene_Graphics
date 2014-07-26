/**
 * A new graphic component. This component is used in
 * the notes to highlight the process of designing a 
 * new object and then implementing it.
 *
 * @author Dan Jinguji
 * @version Assignment 4: MyScene
 */
public class MyHouse extends NsccComponent {
  
  // instance variables
  private NsccUpTriangle theRoof;
  private NsccRectangle theWalls;
  private NsccRectangle theDoor;
  
  /**
   * Constructor for objects of class MyHouse.
   * This creates a MyHouse object at the specified
   * location
   * @param x the x-coordinate for the object
   * @param y the y-coordinate for the object
   */
  public MyHouse(int x, int y)
  {
    // Specify the constructor for the superclass
    super(x, y, 120, 90);
    
    // Create the roof object
    theRoof = new NsccUpTriangle(0, 0, 120, 40);
    // Set the characteristics of the roof
    theRoof.setFilled(true);
    theRoof.setBackground(new java.awt.Color(0x99, 0x33, 0x00));
    // Place the roof in the MyHouse object
    add(theRoof);
    
    // Create the walls object
    theWalls = new NsccRectangle(10, 40, 100, 50);
    // Set the characteristics of the walls
    theWalls.setFilled(true);
    theWalls.setBackground(java.awt.Color.blue);
    // Place the walls in the MyHouse object
    add(theWalls);
    
    // Create the door object
    theDoor = new NsccRectangle(48, 50, 24, 40);
    // Set the characteristics of the door
    theDoor.setFilled(true);
    theDoor.setBackground(new java.awt.Color(0x99, 0x66, 0x33));
    // Place the door in the MyHouse object
    add(theDoor);
  }
  
  /**
   * Constructor for objects of class MyHouse.
   * This creates a MyHouse object at the specified
   * location and sets the walls to the specified
   * color
   * @param x the x-coordinate for the object
   * @param y the y-coordinate for the object
   * @param c the color of the house walls
   */
  public MyHouse(int x, int y, java.awt.Color c)
  {
    // Specify the constructor for the superclass
    super(x, y, 120, 90);
    
    // Create the roof object
    theRoof = new NsccUpTriangle(0, 0, 120, 40);
    // Set the characteristics of the roof
    theRoof.setFilled(true);
    theRoof.setBackground(new java.awt.Color(0x99, 0x33, 0x00));
    // Place the roof in the MyHouse object
    add(theRoof);
    
    // Create the walls object
    theWalls = new NsccRectangle(10, 40, 100, 50);
    // Set the characteristics of the walls
    theWalls.setFilled(true);
    // Set the desired color of the walls
    theWalls.setBackground(c);
    // Place the walls in the MyHouse object
    add(theWalls);
    
    // Create the door object
    theDoor = new NsccRectangle(48, 50, 24, 40);
    // Set the characteristics of the door
    theDoor.setFilled(true);
    theDoor.setBackground(new java.awt.Color(0x99, 0x66, 0x33));
    // Place the door in the MyHouse object
    add(theDoor);
  }

  /**
   * Change the color of the house
   * 
   * @param c The color for the walls of the house
   */
  public void setColor(java.awt.Color c) {
    theWalls.setBackground(c);
    repaint();
  }
  
  /**
   * Retrieve the color of the house
   * 
   * @return The color of the walls of the house
   */
  public java.awt.Color getColor() {
    return theWalls.getBackground();
  }
  
  /**
   * Changes the size of the house.
   * 
   * @param w The width of the house.
   * @param h The height of the house.
   */
  public void setSize(int w, int h) {
    
    super.setSize(w, h);
    theRoof.setSize(w, (int)(h*0.4));
    theWalls.setSize((int)(w*0.83), (int)(h*0.56)); 
    theWalls.setLocation((int)(w*0.083), (int)(h*0.4));
    theDoor.setSize((int)(w*0.2), (int)(h*0.4));
    theDoor.setLocation((int)(w*0.4), (int)(h*0.56));
    repaint();
  }

}
