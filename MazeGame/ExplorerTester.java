package MazeGame;

/**
 * The ExplorerTester class is used to test the Explorer class
 * @author William Sullivan
 */

public class ExplorerTester {

  /**
   * Creates a new Explorer object. 
   * Then it exectutes the available commands on the Explorer.
   * @param args
   */
  
  public static void main(String[] args) {
    Room r1 = new Room("Boardman 310");
    Explorer explorer = new Explorer("Larry", "Java Teacher", 5, 10, r1);
    System.out.println("Initiating ExplorerTester. 5 4 3 2 1");
    System.out.println("This explorers name is " + explorer.getName());
    System.out.println("This explorers strength are " + explorer.getStrength());
    System.out.println("This explorers hitpounts are " + explorer.getTolerance());
    System.out.println("This explorers description is  " + explorer.getDescription());
    System.out.println("This explorers location is  " + explorer.getLocation().getName());
    System.out.println("Seems to be a legitimate explorer");
  }
}