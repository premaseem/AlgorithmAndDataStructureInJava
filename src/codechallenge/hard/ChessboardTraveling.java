package codechallenge.hard;

import org.junit.Assert;
import org.junit.Test;

/*
Challenge | HARD

Have the function ChessboardTraveling(str) read str which will be a string consisting of the location of a space
on a standard 8x8 chess board with no pieces on the board along with another space on the chess board.
The structure of str will be the following: "(x y)(a b)" where (x y) represents the position you are currently on
with x and y ranging from 1 to 8 and (a b) represents some other space on the chess board with a and b also
ranging from 1 to 8 where a > x and b > y. Your program should determine how many ways there are of traveling from (x y)
on the board to (a b) moving only up and to the right.
For example: if str is (1 1)(2 2) then your program should output 2 because there are only two possible ways to travel
from space (1 1) on a chessboard to space (2 2) while making only moves up and to the right.

Hard challenges are worth 15 points and you are not timed for them.
Sample Test Cases
Input:"(1 1)(3 3)"
Output:6


Input:"(2 2)(4 3)
Output:3

 */
public class ChessboardTraveling {

    @Test
    public void test(){
        Assert.assertEquals(3, move("(2 2)(4 3)"));
    }

    public int move(String str) {

        // parse the numbers
        int x = str.charAt(1) - '0';
        int y = str.charAt(3) - '0';
        int a = str.charAt(6) - '0';
        int b = str.charAt(8) - '0';

        return numberOfPaths(a,b,x,y);

    }

    int  numberOfPaths(int m, int n, int x, int y)
    {
        // If either given row number is first or
        // given column number is first
        if (m == x || n == y)
            return 1;

        // If diagonal movements are allowed then
        // the last addition is required.
        return  numberOfPaths(m-1, n,x,y) + numberOfPaths(m, n-1,x,y);
        // + numberOfPaths(m-1,n-1);
    }

}
