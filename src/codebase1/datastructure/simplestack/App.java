package codebase1.datastructure.simplestack;

public class App {
    public static void main(String... args) {
        System.out.println("custom stack implementation");
        CustomStack theStack = new CustomStack(5);
        theStack.push(13);
        theStack.push(23);
        theStack.push(33);
        theStack.push(43);
        theStack.push(53);
        theStack.push(63);
        theStack.push(73);
        theStack.push(83);
        System.out.println("popped out value "+ theStack.pop());

        theStack.printStack();
        theStack.pop();
        theStack.printStack();

        theStack.peak();

        // empty out the stack
        while (!theStack.isEmpty()){
            System.out.println("popped out value "+ theStack.pop());
        }
    }
}
