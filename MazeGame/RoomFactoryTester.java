package MazeGame;

/**
 * The RoomFactoryTester class is used to test the RoomFactory class
 * @author William Sullivan
 */

public class RoomFactoryTester {

  /**
   * Creates a new RoomFactory object. 
   * Then it exectutes the available commands on the RoomFactory.
   * @param args
   */
  
  public static void main(String[] args) {
    RoomFactory rf1 = new RoomFactory();
    Room r1 = new Room("Boardman 310");
    System.out.println("Initiating RoomFactoryTester. 5 4 3 2 1");
    System.out.println("We have the following room: " + r1.getName());
    System.out.println("We are going to add it to check the RoomFactory to make sure we haven't given it the room");
    System.out.println("Test proves: " + rf1.containsRoomName(r1.getName()));
    System.out.println("Let's add it to the Roomfactory");
    rf1.addRoomToList(r1);
    System.out.println("Now the test proves: " + rf1.containsRoomName(r1.getName()));
    System.out.println("Seems to be a legitimate RoomFactory");

  }
}