package MazeGame;

/**
 * A class to represent a Denizen in the maze.
 * @author William Sullivan
 */


public class Denizen {
  
  // Private variables 
  private String name;
  private int strength;
  private int tolerance;
  
  /**
   * Constructor -  Creates a Denizen
   * @param n
   * @param s
   * @param t
   */
  public Denizen(String n, int s, int t) {
    name = n;
    strength = s;
    tolerance = t;
  }
  
  // Queries
  /**
   * 
   * @return Name of Denizen
   */
  public String getName() {
    return name;
  }
  
  /**
   * 
   * @return Strength of Denizen
   */
  public int getStrength() {
    return strength;
  }
  
  /**
   * 
   * @return Tolerance of Denizen
   */
  public int getTolerance() {
    return tolerance;
  }
  
  
  // Commands
  /**
   * Pokes an explorer. 
   * 
   */
  public void poke(Explorer explorer) {
    int hitStrength = explorer.getStrength();
    System.out.println("You just poked " + this.getName());
    tolerance = tolerance - hitStrength;
    if (tolerance <= 0) {
      System.out.println("You defeated " + this.getName());
      explorer.getLocation().removeFromDenizenList(this);
    } else {
      System.out.println("You just got poked by " + this.getName());
      explorer.poke(this);
    }
  }
}





