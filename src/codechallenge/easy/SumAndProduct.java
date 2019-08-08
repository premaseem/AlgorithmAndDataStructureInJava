package codechallenge.easy;

/**
 * separate the digits in given number and find the different between
 * the product and sum of all the digits in given number.
 */
public class SumAndProduct {

    public static void main(String[] args) {

        int num = 3452;

        int sum = 0;
        int prod = 1;
        String sn = "" + num;
        for (int i = 0; i < sn.length(); i++) {
            Integer numberAt = Integer.parseInt(sn.charAt(i) + "");
            sum += numberAt;
            prod *= numberAt;

        }

        int ans = prod - sum;

        System.out.println("Number of digits: " + ans);
    }
}
