package codechallenge.easy.array;

/*
Merge 2 sorted arrays of different lengths and final array should be in sorted order
 */

import me.premaseem.MyUtils;
import org.junit.Test;

public class Merge2ArraysInsort {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int a1[] = {20, 20, 50, 100};
        int a2[] = {10, 30, 90, 100,110,150};

        int[] ints = mergeArrayAndsort(a2, a1);
        MyUtils.isArrSorted(ints);
    }

    int[] mergeArrayAndsort(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        int i1=0,i2=0;
        for (int i = 0; i < c.length; i++) {

            int ae=0; int be=0;
            if(i1 < a.length){
                ae= a[i1];
            } else{
                while(i2<b.length){
                    c[i++] = b[i2++];
                }
                break;
            }

            if(i2 < b.length){
                be= b[i2];
            }else{
                while(i1<a.length){
                    c[i++] = a[i1++];
                }
                break;
            }

            if(ae<be){
                c[i] = a[i1++];
            }else{
                c[i] = b[i2++];
            }

        }

        MyUtils.printArr(c);
        return c;
    }

}
