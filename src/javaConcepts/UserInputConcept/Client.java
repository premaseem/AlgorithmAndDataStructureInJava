package javaConcepts.UserInputConcept;



import java.util.Scanner;

public class Client{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeatRunFlag = 1;
//        RemoteControl remote = new RemoteControl();

        while (repeatRunFlag == 1) {

            System.out.println("Welcome to Vechile factory program ");
            System.out.println(" prss 11 to create a bike object ");
            System.out.println(" prss 12 to create a car object ");
            System.out.println(" prss 13 to create a Truck object ");
            int userInput = scan.nextInt();

            if(userInput == 11){

                System.out.println("create bike object over here ");


            }else if(userInput == 12){
                System.out.println("create car object over here ");

            }else if(userInput == 13){

                System.out.println("create truck object over here ");
            }else {
                System.out.println("create bike object over here ");
            }


            System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
            System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
            try {
                repeatRunFlag = scan.nextInt();
            } catch (Exception e) {
                repeatRunFlag = 0;
            }
        }
    }
}