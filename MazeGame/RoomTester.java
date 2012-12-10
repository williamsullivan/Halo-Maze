package MazeGame;

/**
 * The RoomTester class is used to test the Room class
 * @author William Sullivan
 */

public class RoomTester {

  /**
   * Creates a new Room object. 
   * Then it exectutes the available commands on the Room.
   * @param args
   */
  
  public static void main(String[] args) {
    Room r1 = new Room("Boardman 310");
    System.out.println("Initiating RoomTester. 5 4 3 2 1");
    System.out.println("This room name is " + r1.getName());
    System.out.println("This room has the following description: " + r1.getDescription());
    System.out.println("Seems to be a legitimate Room");
  }
}