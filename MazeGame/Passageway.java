package MazeGame;

/**
 * A class representing passageways.
 * @author William Sullivan
 *
 */

public class Passageway {
  
  // Variables
  private String name;
  private int refnumber;
  private Room room;

  
  /**
   * Constructs a passageway object.
   * @param n
   * @param reference                                                                                          
   */
  public Passageway(String n, Room r1) {
    name = n;
    room = r1;
  }
  
  /**
   * Constructs a passageway object.
   * @param n
   * @param reference                                                                                          
   */
  public Passageway(String n, int reference) {
    name = n;
    refnumber = reference;
  }
  
  /**
   * he
   * @return The name of the passageway.
   */
  public String getName() {
    return name;
  }
  
  /**
   * 
   * @return The reference number of the passageway.
   */
  public int getRefnumber() {
    return refnumber;
  }
  
  /**
   * This gets a room by calling upon the MazeGameTester class whose method
   * returns the mazegame which inside has a 
   * method to return a roomlist. The roomlist has a method to get a 
   * room based off it's name.
   * @return A room object.
   */
  public Room getRoom() {
    return MazeGameTester.returnMazeGame().returnRoomFactory().getByRoomName(room.getName()); 
  }
}

