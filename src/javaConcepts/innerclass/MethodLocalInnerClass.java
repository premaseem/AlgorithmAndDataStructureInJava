package javaConcepts.innerclass;

/**
 * Created by asee2278 on 2/8/17.
 */


public class MethodLocalInnerClass {
    private int data = 30;//instance variable


    void display() {
        class Local {
            void msg() {
                System.out.println(data);
                class YetAnotherLocal {
                }
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        MethodLocalInnerClass obj = new MethodLocalInnerClass();
        obj.display();


    }
}