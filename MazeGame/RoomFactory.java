package MazeGame;
import java.util.ArrayList;
import java.util.*;


/**
 * This is a class used to represent 
 * an arraylist of rooms called listOfRooms
 * Also can create rooms when passed a String Room name
 * @author William Sullivan
 *
 */

public class RoomFactory {
  
  // A private array of rooms called ListOfRooms.
  private java.util.ArrayList<Room> listOfRooms;
  int Refnum = 0;

  /**
   * Creates a RoomFactory object using an arraylist.
   */
  public RoomFactory() {
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
  
  /**
   * Looks through the list for a specified room
   */
  public boolean containsRoomName(String s){
    Room temp;
    for (int i = 0; i < listOfRooms.size(); i++ ) {
      temp = (Room) listOfRooms.get(i);
      if (s.equals(temp.getName())) {
        return true;
      }
    }
    return false; 
  }
  
   /**
   * Looks through the list for a specified room by name and returns it
   */
  public Room getByRoomName(String s){
    Room temp;
    for (int i = 0; i < listOfRooms.size(); i++ ) {
      temp = (Room) listOfRooms.get(i);
      if (s.equals(temp.getName())) {
        return temp;
      }
    }
    return null; 
  }
 
  // Command
  
  /**
   * Adds a room to the RoomFactory.
   */
  public void addRoomToList(Room r) {
    listOfRooms.add(r);
  } 
  
/**
 * Creates a room based on a string and adds it to the list.
 * @param r
 */
  public void addNewRoomToList(String r) {
      Room newroom = new Room(r);
   listOfRooms.add(newroom);
  } 
}



