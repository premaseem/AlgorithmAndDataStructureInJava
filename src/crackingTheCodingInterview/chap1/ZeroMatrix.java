package crackingTheCodingInterview.chap1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ### Zero Matrix:
 * Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to 0.
 */
public class ZeroMatrix {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 0, 3}};
        int[][] exp = {
                {1, 0, 3},
                {1, 0, 3},
                {0, 0, 0}};

        solution1(matrix);

        for (int i = 0; i < exp.length; i++) {
            for (int j = 0; j < exp.length; j++) {
                assert exp[i][j] == matrix[i][j];
            }
        }

    }

    // Basic solution
    private void solution1(int[][] m) {
        List<Integer> r = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(0 == m[i][j]){
                    r.add(i);
                    c.add(j);
                }
            }
        }

        for (Integer i: r){
            zerofied(m,i,null);
        }
        for (Integer i: c){
            zerofied(m,null,i);
        }


    }

    void zerofied(int[][] m, Integer r, Integer c){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if((r != null && r ==i ) || (c != null && c == j)  ){
                    m[i][j] = 0;
                }
            }
        }
    }

}
