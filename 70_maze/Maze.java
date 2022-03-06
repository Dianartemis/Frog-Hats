// Diana Akhmedova, Gloria Lee, Jack Chen (TNPG: BrainFork)
// APCS pd8
// HW70 -- Thinkers of the Corn
// 2022-03-07m
// time spent: 2hrs

/***
 * SKEELTON for
 * class MazeSolver
 * Implements a blind depth-first exit-finding algorithm.
 * Displays probing in terminal.
 *
 * USAGE:
 * $ java Maze [path/to/mazefile]
 * (mazefile is ASCII representation of a maze, using symbols below)
 *
 * ALGORITHM for finding exit from starting position:
 * - IF:
 *    - The maze is solved, exit the maze (maze is solved when the current tile value is "$").
 *    - Current tile value is " " or "." or "@", return. (to avoid walls, already visited paths).
 * - ELSE:
 *    - If: The tile is "#"...
 *        - Current tile becomes "@".
 *        - Move one tile up/right/down/left.
 *    - Else:
 *        - If all four directions are ruled out, tile becomes "."
 * - Otherwise, the maze is unsolveable.
 *
 * DISCO:
 * - The maze utilizes characters, not Strings, so you would use ==, not the equals() method.
 * - To save our mazes with the whitespace, we had to disable the whitespace package in settings.
 * - We will receive an out of bounds error if we made the maze larger than the row and column we initally set.
 *
 * QCC:
 * - Is a visited path the same as a dead end? If not, how do we represent a dead end?
 * - How do we avoid ending up in an endless loop?
 * - To drop the hero on random locations on the path, should we set h and w to public or use accessor methods?
 *
 ***/

//enable file I/O
import java.io.*;
import java.util.*;


class MazeSolver
{
  final private int FRAME_DELAY = 50;

  private char[][] _maze;
  public int h, w; // height, width of maze
  private boolean _solved;

  //~~~~~~~~~~~~~  L E G E N D  ~~~~~~~~~~~~~
  final private char HERO =           '@';
  final private char PATH =           '#';
  final private char WALL =           ' ';
  final private char EXIT =           '$';
  final private char VISITED_PATH =   '.';
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public MazeSolver( String inputFile )
  {
    // init 2D array to represent maze
    // (80x25 is default terminal window size)
    _maze = new char[80][25];
    h = 0;
    w = 0;

    //transcribe maze from file into memory
    try {
      Scanner sc = new Scanner( new File(inputFile) );

      System.out.println( "reading in file..." );

      int row = 0;

      while( sc.hasNext() ) {

        String line = sc.nextLine();

        if ( w < line.length() )
          w = line.length();

        for( int i=0; i<line.length(); i++ )
          _maze[i][row] = line.charAt( i );

        h++;
        row++;
      }

      for( int i=0; i<w; i++ )
        _maze[i][row] = WALL;
      h++;
      row++;

    } catch( Exception e ) { System.out.println( "Error reading file" ); }

    //at init time, maze has not been solved:
    _solved = false;
  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, ESC
    //emacs shortcut: M-x quoted-insert, ESC

    int i, j;
    for( i=0; i<h; i++ ) {
      for( j=0; j<w; j++ )
        retStr = retStr + _maze[j][i];
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void solve(int x,int y) -- recursively finds maze exit (depth-first)
   * @param x starting x-coord, measured from left
   * @param y starting y-coord, measured from top
   **/
  public void solve( int x, int y )
  {
    delay( FRAME_DELAY ); //slow it down enough to be followable

    //primary base case
    if ( _solved ) {
      System.exit(0);
    }
    //other base cases
    else if ( _maze[x][y] == EXIT ) {
      _solved = true;
      System.out.println( this ); //refresh screen
      return;
    }
    else if ( _maze[x][y] == WALL || _maze[x][y] == VISITED_PATH || _maze[x][y] == HERO ) {
      return;
    }
    //otherwise, recursively solve maze from next pos over,
    //after marking current location
    else {
      // int counter = 0;
      // if (_maze[x + 1][y] == WALL || _maze[x + 1][y] == VISITED_PATH) {
      //   counter++;
      // }
      // if (_maze[x - 1][y] == WALL || _maze[x - 1][y] == VISITED_PATH ) {
      //   counter++;
      // }
      // if (_maze[x][y + 1] == WALL || _maze[x][y + 1] == VISITED_PATH) {
      //   counter++;
      // }
      // if (_maze[x][y - 1] == WALL || _maze[x][y - 1] == VISITED_PATH) {
      //   counter++;
      // }
      // if (counter >= 3) { //dead end
      //   _maze[x][y] = VISITED_PATH;
      //   return;
      // }
      // counter = 0;
      _maze[x][y] = HERO;
      System.out.println( this ); //refresh screen
      solve(x, y - 1); //up
      solve(x + 1, y); //right
      solve(x, y + 1); //down
      solve(x - 1, y); //left
      _maze[x][y] = VISITED_PATH;
      System.out.println( this ); //refresh screen
    }
  }

  //accessor method to help with randomized drop-in location
  public boolean onPath( int x, int y) {
    if (_maze[x][y] == PATH) {
      return true;
    }
    else {
      return false; 
    }
  }
  //   for (int i = 0; i < _maze.length; i++) {
  //     for (int h = 0; h < _maze[i].length; h++) {
  //       if (_maze[i][h] == PATH) {
  //         return true;
  //       }
  //       else {
  //         return false;
  //       }
  //     }
  //   }
  //   return false;
  // }
}//end class MazeSolver


public class Maze
{
  public static void main( String[] args )
  {
    String mazeInputFile = null;

    try {
      mazeInputFile = args[0];
    } catch( Exception e ) {
      System.out.println( "Error reading input file." );
      System.out.println( "USAGE:\n $ java Maze path/to/filename" );
    }

    if (mazeInputFile == null) { System.exit(0); }

    MazeSolver ms = new MazeSolver( mazeInputFile );

    //clear screen
    System.out.println( "[2J" );

    //display maze
    System.out.println( ms );

    //drop hero into the maze (coords must be on path)
    // ThinkerTODO: comment next line out when ready to randomize startpos
    // ms.solve( 4, 3 );

    //drop our hero into maze at random location on path
    // YOUR RANDOM-POSITION-GENERATOR CODE HERE
    
    // int startX = 4;
    // int startY = 3;
    int startX = (int)(Math.random() * ms.w);
    int startY = (int)(Math.random() * ms.h);
    if (ms.onPath( startX, startY )) {
      ms.solve( startX, startY );
    }
    else {
      ms.solve( 4, 3 );
    }
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class Maze
