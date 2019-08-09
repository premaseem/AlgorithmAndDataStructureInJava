package codechallenge.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class QuestionMark {

    @Test
    public void test(){
        assert QuestionsMarks("ac2c?7??sss?3rr1??????5");
        assert QuestionsMarks2("acc?7??sss?3rr1??????5");
    }

    public static boolean QuestionsMarks(String str) {
        char[] ca = str.toCharArray();
        List<Integer> nl = new ArrayList<>();

        for(Character cx : ca){
            if(Character.isDigit(cx)){
                nl.add(Integer.parseInt(""+cx));
            }
        }

        boolean f = true;
        String p ="";
        for(int i=0;i<nl.size()-1; i++){
            if (10 == nl.get(i) + nl.get(i+1)){
                p = p+""+nl.get(i)+""+ nl.get(i+1) +" ";
                f = false;
            }
        }

        if(f){
            return false;
        }

        String[] sa = p.split(" ");
        for(int i=0;i<sa.length;i=i+2){
            String pc = str.substring(str.indexOf(sa[i].charAt(i)),str.indexOf(sa[i].charAt(i+1)));
            int ct = pc.length() - pc.replace("?","").length();
            if(ct==3){
                return true;
            }
        }

        return false;
    }


    public  boolean QuestionsMarks2(String str) {

        StringBuilder buffer = new StringBuilder();

        for(int i=0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i)) || str.charAt(i)=='?'){
                buffer.append(str.charAt(i));
            }
        }

        for(int i=0; i < buffer.length(); i++){
            if(Character.isDigit(buffer.charAt(i))){
                if(i+4 <= buffer.length()){
                    if(buffer.charAt(i+1)=='?'
                            && buffer.charAt(i+2) == '?'
                            && buffer.charAt(i+3) == '?'
                            && Character.isDigit(buffer.charAt(i+4))){

                        int num1 = Character.getNumericValue(buffer.charAt(i));
                        int num2 = Character.getNumericValue(buffer.charAt(i+4));

                        if(num1 + num2 == 10){
                            return true;
                        }
                    }
                    if(i+5 < buffer.length()){
                        i = i+5;
                    }
                }
            }
        }
        return false;

    }



}
