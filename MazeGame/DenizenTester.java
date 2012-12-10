package MazeGame;

/**
 * The DenizenTester class is used to test the Denizen class
 * @author William Sullivan
 */

public class DenizenTester {

  /**
   * Creates a new Denizen object. 
   * Then it exectutes the available commands on the Denizen.
   * @param args
   */
  
  public static void main(String[] args) {
    Denizen denizen = new Denizen("Mark", 5, 10);
    System.out.println("Initiating DenizenTester. 5 4 3 2 1");
    System.out.println("This denizens name is " + denizen.getName());
    System.out.println("This denizens strength are " + denizen.getStrength());
    System.out.println("This denizens hitpounts are " + denizen.getTolerance());
    System.out.println("Seems to be a legitimate denizen");
  }
}