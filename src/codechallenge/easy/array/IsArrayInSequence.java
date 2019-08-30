package codechallenge.easy.array;

import me.premaseem.MyUtils;
import org.junit.Assert;
import org.junit.Test;


/*
Challenge: find out if given array is in sequence using recursion
 */
public class IsArrayInSequence {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

    Integer[] seq1 = {3,4,5,6,7,8};
    Integer[] seq2 = {3,5,6,7,8};

    assert isSeq(seq1,seq1.length-1);
    assert ! isSeq(seq2, seq2.length-1);

    }

    private boolean isSeq(Integer[] seq, int i) {
        if(i==0){
            return true;
        }
        System.out.println("checking for index "+ i );
        return seq[i] - 1 == seq[i-1] && isSeq(seq, i-1);
    }


}
