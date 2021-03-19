package codechallenge.medium;


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

/*
Chewy Debug exercise
A robot follows instructions to move around.

It can move in four different directions:
 - North
 - East
 - South
 - West

      N
      |
      |
 W -------- E
      |
      |
      S

There are three different instructions:
 - F will move the robot forward one step, in the direction it's facing
 - L will turn the robot counter-clockwise 90 degrees. i.e. if it was facing North, it will now face West
 - R will turn the robot clockwise 90 degrees, i.e if it was facing North, it will now face East

We have a buggy implementation of isRoundtrip below. Round trip simply means the robot comes back to where it started after following the instructions.

Our goal here is to

- identify and fix the bugs
- verify the fixes through test cases
*/

public class RobotMovement {
    //buggy implementation
    //sample instructions are: "FFLF", "RFFRFF", etc
    public static boolean isRoundTrip(String instructions) {
        int x = 0;
        int y = 0;
        //possible values : E (0), N (1), W (2), S (3)
        int direction = 0;

        for (int i = 0; i < instructions.length(); i++) {
            switch (instructions.charAt(i)) {

                case 'F':
                    System.out.println(direction);
                    if (direction == 0) {
                        x += 1;
                    } else if (direction == 1 ) {
                        y += 1;
                    } else if (direction == 2) {
                        x -= 1;
                    } else if (direction == 3) {
                        y -= 1;
                    }
                    System.out.println("movement = "+ x + ":"+y);
                    break;

                case 'L':
                    direction++;
                    if ( direction >= 4){
                        direction = 0;
                    }
                    break;

                case 'R':
                    direction = direction - 1;
                    if (direction < 0) {
                        direction = 4 - direction;
                    }
                    break;

                default:
                    throw new RuntimeException("Unexpected instruction " + instructions.charAt(i));
            }
        }
        System.out.println(x + " : " + y);
//        System.out.println(y);
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        assert 1 != 1 ;
        System.out.println( RobotMovement.isRoundTrip("FLFLFLF"));
          System.out.println( RobotMovement.isRoundTrip("FRFRFRF"));
          System.out.println( RobotMovement.isRoundTrip("RFFRFFFF"));

    }
}
