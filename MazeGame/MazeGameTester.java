
package MazeGame;

/**
 * The MazeGameTester class is used to start the game.
 * @author William Sullivan
 */

public class MazeGameTester {
  
  // Creates a mazegame variable.
  
  public static MazeGame mazeGame;
  
  /**
   * @return A mazegame object.
   */
  
  public static MazeGame returnMazeGame() {
    return mazeGame;
  }
  
  /**
   * Creates a new MazeGame object. 
   * Then it exectutes the doGameLoop method.
   * @param args
   */
  
  public static void main(String[] args) {
    mazeGame = new MazeGame();
    mazeGame.play();
  }
}
