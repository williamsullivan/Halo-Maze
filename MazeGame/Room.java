package MazeGame;
import java.util.*;

/**
 * A room class representing rooms in the maze.
 * @author Williiam Sullivan
 *
 */

public class Room {
  
  // Variables
  
  private String name;
  private String description;
  private int refnum;
  private ArrayList<Passageway> passageways;
  private ArrayList<Denizen> denizens;
  
  // private ArrayList<Item> items; Will be used when there is an item implementation class
  
  
  /**
   * Creates a room object with a name, description, and reference number.
   * @param n
   * @param d
   * @param ref
   */
  
  public Room(String n, String d, int ref) {
    
    name = n;
    description = d;
    refnum = ref;
    passageways = new ArrayList<Passageway>();
    denizens = new ArrayList<Denizen>();  
  }
  
   /**
   * Creates a room object with a name, description, and reference number.
   */
  
  public Room(String n) {
    
    name = n;
    description = "Newly created room";
    passageways = new ArrayList<Passageway>();
    denizens = new ArrayList<Denizen>();  
  }

  //Queries
  
  
  /**
   * @return Name of the Room.
   */
  public String getName() {
    return name;
  }
  
  /**
   * 
   * @return Description of the Room.
   */
  
  public String getDescription() {
    return description;
  }
  
  /**
   * 
   * @return Reference number of the room.
   */
  public int getRefnum() {
    return refnum;
  }
  
  /**
   * 
   * @return The size of the passageway list.
   */
  public int passagewaySize() {
    
    return passageways.size();
  }
  /**
   * 
   * @return The size of denizen list.
   */
  public int denizensSize() {
    return denizens.size();
  }
  
  /**
   * 
   * @param name
   * @return Passageway from the passageway list or null if the passageway is not found.
   */
  
  public Passageway getPassagewayFromList(String name) {
    Passageway bagel;
    for (int b = 0; b < passagewaySize(); b++ ) {
      bagel = (Passageway) passageways.get(b);
      if (name.toUpperCase().compareTo(bagel.getName().toUpperCase()) == 0) {
        return bagel;
      }
    }
    
    return null;
  }
  
  /**
   * 
   * @param name
   * @return Denizen from the denizen list or null if denizen is not found.
   */
  
  public Denizen getDenizenFromList(String name) {
    Denizen coffee;
    for (int c = 0; c < denizensSize(); c++ ) {
      coffee = (Denizen) denizens.get(c);
      if (name.toLowerCase().compareTo(coffee.getName().toLowerCase()) == 0) {
        return coffee;
      }
    }
    return null;
  }
  
  /**
   * 
   * @return A string that represents everything in the room object to pass to the Explorer.
   */
  public String look() {
    String foo;
    
    foo = ("You are in the " + getName() + " room." + "\n");
    foo += (getDescription() + "\n");
    
    if (passagewaySize() == 0)
      foo += ("You have no way out." + "\n");
    else { 
      foo += ("You can travel in the following ways: \n");
      
      for (int i = 0; i < passagewaySize(); i++) {
        foo += (((Passageway) passageways.get(i)).getName() + "\n");
      }
    }
    if (denizensSize() == 0)
      foo += ("There are no denizens in this room.");
    else {
      foo += ("You see the following Denizens: \n");
      for (int i = 0; i < denizensSize(); i++) {
        foo += (((Denizen) denizens.get(i)).getName() + "\n");
        
      }
    }
    return foo;
  }
  
  // Commands
  
  /**
   * Adds a passageway to the passageway list.
   */
  public void addToPassagewayList(Passageway p) {
    passageways.add(p);
  }
  
  /**
   * Adds/Changes a reference number to the room.
   */
  public void addRefnum(int ref){
   this.refnum = ref;
  }
  
  /**
   * Changes the rooms description
   */
  public void newDescription(String r){
    this.description = r;
  }
  
  /**
   * Add's denizen "d" to denizen list.
   * @param d
   */
  public void addToDenizenList(Denizen d) {
    denizens.add(d);
  }
  
  /**
   * Removes denizen "d" from denizen list.
   * @param d
   */
  public void removeFromDenizenList(Denizen d) {
    denizens.remove(d);
  }

}
