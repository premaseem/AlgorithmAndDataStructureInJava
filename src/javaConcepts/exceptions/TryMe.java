package javaConcepts.exceptions;

/**
 * Created by asee2278 on 2/7/17.
 */
public class TryMe {
    public static void main(String[] args) {
        Integer data = null;
        Integer balance = 0;
        int x = 1;
        try{
            System.out.println("write some to a file");
            data=50/balance;
//            data = null;

            try{
                data.toString();
            }catch(NullPointerException e){
                System.out.println(e);
                data = 1;
                System.out.println(x);
                System.out.println("write default valie to a file");
            }

        }catch(ArithmeticException e){
            System.out.println(e);
            data = 1;
        }finally {
            System.out.println("Run always no matter exception occures or not ... ");
            System.out.println("close the file ");
        }

        System.out.println("rest of the code..."+data);
    }

    }



