package MazeGame;
import java.io.*;
import java.util.*;


/**
 * A class to represent the maze game.
 * @author William Sullivan
 *
 */

public class MazeGame {
  
  private Scanner scan;
  public RoomFactory rooms;
  public Explorer myExplorer;
  private int endGame;
  private String[] arg;
  
  
  /**
   * A constructor to create a maze game object.
   *
   */
  public MazeGame() {
    scan = new Scanner(System.in);
    rooms = new RoomFactory();
    createRoomFactory();
    System.out.println( "          (>'o')> ><(((*> A Kirby Wants Fish Presents  ");
    System.out.println( "+-----------------------------------------------------+");
    System.out.println( "|                                                     |");
    System.out.println( "|                 Halo Maze 1.0                       |");
    System.out.println( "|           by William Joseph Sullivan                |");
    System.out.println( "|                                                     |");
    System.out.println( "|             ¬_¬     2/24/08  ¬_¬                    |");
    System.out.println( "|                                                     |");
    System.out.println( "+-----------------------------------------------------+");
    System.out.println("Welcome to the Halo Maze. We don't like ghosts here.");
    System.out.print("Please enter the name which you wish you were called:");
    myExplorer = new Explorer(scan.nextLine(), null, 800, 20, rooms.getRoomBasedOnRefnum(0));
    System.out.print("Describe yourself. This could be things such as where do you hail from? For instance, I am Sir William. ");
    System.out.print("The gahd of Poke.");
    myExplorer.setDescription(scan.nextLine());
    endGame = 0;
    
  }
  
  /**
   * A method to start the game
   *
   */
  public void play() {
    while (endGame == 0) {
      System.out.println("What would you like to do next?");
      arg = getArg();
      parser(arg);

    }
  }
  
  /**
   * 
   * @return The RoomFactory.
   */
  
  public RoomFactory returnRoomFactory() {
    return rooms;
  }
  /**
   * Creates a RoomFactory.
   * Everything is connected together by passageways.
   * Then it adds every room to the list.
   *
   */
  
  public void createRoomFactory() { 
   File MazeData = new File("./MazeGame/mazedata.txt");
    try{
     Scanner scanner = new Scanner(MazeData);
     String s1;
     String s2;
     String s3;
     while(scanner.hasNext()){
      s1 = scanner.next();
      s2 = scanner.next();
      s3 = scanner.next();
      if (rooms.containsRoomName(s1) == false) { rooms.addNewRoomToList(s1);}
      if (rooms.containsRoomName(s2) == false) { rooms.addNewRoomToList(s2);}
      if (s3.equals("e")) {rooms.getByRoomName(s1).addToPassagewayList(new Passageway("EAST",  rooms.getByRoomName(s2)));}
      if (s3.equals("w")) {rooms.getByRoomName(s1).addToPassagewayList(new Passageway("WEST",  rooms.getByRoomName(s2)));}
      if (s3.equals("n")) {rooms.getByRoomName(s1).addToPassagewayList(new Passageway("NORTH", rooms.getByRoomName(s2)));}
      if (s3.equals("s")) {rooms.getByRoomName(s1).addToPassagewayList(new Passageway("SOUTH", rooms.getByRoomName(s2)));}
     }
    } catch(FileNotFoundException fnfex){
     System.out.println("No File Exists");
    }
  }
  
  /**
   * 
   * @return A split string by creating a string 
   * using the scanner class and splitting it by spaces.
   */
  public String[] getArg() {
    String foobar = scan.nextLine();
    return foobar.split(" ");
  }
  
  /**
   * A parser used for reading the input of the user 
   * entered by the user and then doing the necessary methods.
   * @param arg
   */
  
  public void parser(String[] arg) {
    if (arg.length > 0) {
      if (arg[0].toLowerCase().equals("move")) {
        if (arg.length > 1) {
          if (myExplorer.getLocation().getPassagewayFromList(arg[1])
                != null) {
            myExplorer.move(myExplorer.getLocation().getPassagewayFromList(arg[1].toUpperCase()).getRoom());
          } 
        } else {
          System.out.println("In what direction would you like to go?");
        }
      } else if (arg[0].toLowerCase().equals("look")) {
        System.out.println(myExplorer.lookAround());
      } else if (arg[0].toLowerCase().equals("about")) {
        System.out.println("Your name is " + myExplorer.getName() + ". " + "Your Description is " + myExplorer.getDescription() + ".");
      } else if (arg[0].toLowerCase().equals("quit")) {
        System.out.println("Game Over.");
        System.exit(0);
      }
    } 
  }
}
