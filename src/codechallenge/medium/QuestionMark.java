package codechallenge.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class QuestionMark {

    @Test
    public void test(){
        assert QuestionsMarks("acc?7??sss?3rr1??????5");
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
            String pc = str.substring(sa[i].indexOf(i),sa[i].indexOf(i+1));
            int ct = pc.length() - pc.replace("?","").length();
            if(ct==3){
                return true;
            }
        }
        // str.indexOf(ln.get())

        return false;

    }


    public static void main (String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(QuestionsMarks(s.nextLine()));
    }


}
