package MazeGame;

/**
 * A class to represent an Explorer of the maze.
 * @author William Sullivan
 * 
 */

public class Explorer {
  
  // Variables
  
  private String name;
  private String description;
  private int tolerance;
  private int strength;
  private Room location;
  
  /**
   * Constructs an explorer object.
   * @param n
   * @param d
   * @param t
   * @param s
   * @param l
   */
  public Explorer(String n, String d, int t, int s, Room l) {
    
    name = n;
    description = d;
    tolerance = t;
    strength = s;
    location = l;
  }
  
// Queries
  /**
   * @return Name of the Explorer.
   */
  public String getName() {
    return name;
  }
  
  /**
   * 
   * @return The description of the Explorer object.
   */
  public String getDescription() {
    return description;
  }

  /**
   * 
   * @return The tolerance of the Explorer
   */
  public int getTolerance() {
    return tolerance;
  }
  
  /**
   * 
   * @return The strength of the Explorer
   */
  public int getStrength() {
    return strength;
  }
  
  /**
   * 
   * @return The location of the Explorer.
   */
  
  public Room getLocation() {
    return location;
  }
  
  /**
   * Moves the explorer to a new room by changing his location to a new room object.
   * @param newRoom 
   */
  public void move(Room r1) {
    location = r1;
  }
  
  // Commands
  
  /**
   * Returns a string that says You look around followed by all the details of the location of the Explorer.
   */
  public String lookAround() {
    System.out.println("You look around the room.");
    return location.look();
  }
  
  /**
   * Sets the description of the explorer.
   * @param d
   */
  
  public void setDescription(String d) {
    description = d;
  }
  
  /**
   * Pokes a denizen "d".
   * @param d
   */
  public void poke(Denizen d) {
    int hitStrength = d.getStrength();
    System.out.println( d.getName() + " pokes you back.");
    tolerance = tolerance - hitStrength;
    if (tolerance <= 0) {
      System.out.println("You got owned by " + d.getName());
      System.exit(0); 
    } else {
      System.out.println("Your tolerance is " + String.valueOf(getTolerance()));
    }
    
  }
  
}
