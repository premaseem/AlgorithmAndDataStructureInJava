package codechallenge.easy;

/**
 * when number is added from right to left the carry over was taken in consideration
 *          86752
 *            349
 *         ---------
 *          86091 (num added without carry over)
 */

public class AddWithoutCarryOver {
    public static void main(String[] args) {
        int param1 = 349;
        int param2 = 86752;


        String s1 = String.valueOf(param1);
        String s2 = String.valueOf(param2);

        int gap = s1.length() - s2.length();
        String finalAns = "";
        int len;
        if (gap > 0) {
            finalAns += s1.substring(0, gap);
            s1 = s1.substring(gap);
            len = s2.length();
        } else {
            finalAns += s2.substring(0, -gap);
            s2 = s2.substring(-gap);
            len = s1.length();
        }
        char[] ca1 = s1.toCharArray();
        char[] ca2 = s2.toCharArray();


        for (int i = 0; i < len; i++) {

            int num1 = Integer.parseInt(String.valueOf(ca1[i]));
            int num2 = Integer.parseInt(String.valueOf(ca2[i]));


            int aa = num1 + num2;
            char c = String.valueOf(aa).charAt(String.valueOf(aa).length() - 1);
            finalAns = finalAns + c;
        }
        System.out.println(finalAns);
    }
}
