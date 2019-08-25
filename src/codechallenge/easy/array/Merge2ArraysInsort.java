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

        int a1[] = {20, 20, 50, 100, 140, 180};
        int a2[] = {10, 30, 90, 100};

        int[] ints = mergeArrayAndsort(a2, a1);
        MyUtils.isArrSorted(ints);
    }

    int[] mergeArrayAndsort(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        int i = 0, i1 = 0, i2 = 0;
        for (; i < c.length; i++) {

            int i1e, i2e;
            if (i1 < a.length) {
                i1e = a[i1];
            } else {
                while (i2 < b.length) {
                    c[i] = b[i2++];
                    i++;
                }
                break;
            }

            if (i2 < b.length) {
                i2e = b[i2];
            } else {
                while (i1 < a.length) {
                    c[i] = a[i1++];
                    i++;
                }
                break;
            }

            if (i1e < i2e) {
                c[i] = i1e;
                i1++;
            } else {
                c[i] = i2e;
                i2++;
            }
        }

        MyUtils.printArr(c);
        return c;
    }

}
