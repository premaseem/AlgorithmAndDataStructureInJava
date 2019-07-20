package datastructure.charstack;

public class CharStack {


    public String reverseByLoop(String input){
        char[] chars = input.toCharArray();
        StringBuilder initial = new StringBuilder();


        for(int i=0; i< chars.length; i++){
            initial.append(chars[i]);
        }

        StringBuilder reversed = new StringBuilder();
        for(int i=chars.length-1; i>=0;i--){
            reversed.append(chars[i]);
        }

        System.out.printf("initial String is %s and after reversing %s",initial, reversed);


        return reversed.toString();
    }

    // inbuild method to reverse string
    public String getReverseStringOutOfbox(String input){
        String output = new StringBuilder(input).reverse().toString();
        return output;
    }
}

