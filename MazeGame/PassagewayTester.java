package MazeGame;

/**
 * The PassagewayTester class is used to test the Passageway class
 * @author William Sullivan
 */

public class PassagewayTester {

  /**
   * Creates a new Passageway object. 
   * Then it exectutes the available commands on the Passageway.
   * @param args
   */
  
  public static void main(String[] args) {
    Room r1 = new Room("Boardman 310");
    Passageway p1 = new Passageway("North", r1);
    System.out.println("Initiating PassagewayTester. 5 4 3 2 1");
    System.out.println("This passageway name is " + p1.getName());
    System.out.println("This passageway contains the following room: " + r1.getName());
    System.out.println("Seems to be a legitimate passageway");
  }
}