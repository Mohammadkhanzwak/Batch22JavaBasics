import java.sql.SQLOutput;
import java.util.Scanner;
public class Scannernestedif {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("do you have a credit card");

        String creditcard=input.next();

        if(creditcard.equalsIgnoreCase("yes")){
            System.out.println("what is the balance on your credit card");

            double balance=input.nextDouble();
            if(balance>1000){
                System.out.println("you need to pay off your credit immediately");
            }else{
                System.out.println("you are in a good standing");
            }

            if(creditcard.equalsIgnoreCase("no")){
                System.out.println("would you like to get one");

            }else{
                System.out.println("Invalid input");
            }

        }


    }
}
