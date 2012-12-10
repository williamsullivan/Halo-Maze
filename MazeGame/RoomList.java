package MazeGame;

/**
 * This is a class used to represent 
 * an arraylist of rooms called listOfRooms
 * @author William Sullivan
 *
 */

public class RoomList {
  
  // A private array of rooms called "ListOfRooms.
  private java.util.ArrayList<Room> listOfRooms;

  /**
   * Creates a roomlist object using an arraylist.
   */
  public RoomList() {
    listOfRooms = new java.util.ArrayList<Room>();
  }
  
  // Query
  
  /**
   * Gets a room object based on it's reference number.
   * @return Room
   */
  
  public Room getRoomBasedOnRefnum(int r) {
    Room temp;
    for (int i = 0; i < listOfRooms.size(); i++ ) {
      temp = (Room) listOfRooms.get(i);
      if (r == temp.getRefnum()) {
        return temp;
      }
    }
    return null;
    
  }
  // Command
  
  /**
   * Adds a room to the roomlist.
   */
  public void addRoomToList(Room r) {
    listOfRooms.add(r);
  } 
}



