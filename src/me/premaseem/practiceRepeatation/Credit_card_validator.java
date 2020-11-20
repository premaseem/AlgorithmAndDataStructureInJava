package me.premaseem.practiceRepeatation;

/*

Credit Card Validator
Programming challenge description:
Credit card numbers can be validated using an industry-standard algorithm called the Luhn Checksum:

From the rightmost digit (the check digit), double the value of every second digit. The check digit is not doubled; the first digit doubled is immediately to the left of the check digit. If the result of this doubling operation is greater than 9 (e.g., 8 × 2 = 16), then subtract 9 from the product (e.g., 16: 16 − 9 = 7, 18: 18 − 9 = 9).
Take the sum of all the digits from step 1, both doubled and natural.
If the total modulo 10 is equal to 0 (if the total ends in zero) then the number is valid according to the Luhn formula; otherwise it is not valid.
The sum of all the digits in the third row is 67+x. If x = 3, then the modulo of 10 = 0, which means the credit card number is valid.

Write a program that will validate credit card numbers using this algorithm and indicate the result.

Input:
A single line of input containing a potential credit card number

Output:
True if the credit card number is valid
False if the credit card number is not valid

Test Data:
6011566926687256 - True
370642420667124 - True
5417438903761250 - True
4518377421351212 - False

 */

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Credit_card_validator {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        List<String> arr = new ArrayList();
        while ((line = in.readLine()) != null) {
//            System.out.println(line);
            char[] ca =  line.toCharArray();
            System.out.println(ca);
            int os = 0;
            for (int i = ca.length-1; i>=0;i=i-2){
                os += Integer.parseInt(""+ca[i]);
            }
            int es = 0;
            for (int i = ca.length-2; i>=0; i=i-2 ){
                Integer d = Integer.parseInt(""+ca[i]) *2;
                d =  d <10 ? d: d - 9;
                os += d;
            }

            System.out.println((os + es) % 10 == 0);
            
        }
    }
}
