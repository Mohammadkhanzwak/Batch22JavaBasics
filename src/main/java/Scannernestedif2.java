import java.util.Scanner;

import java.util.Scanner;

public class Scannernestedif2 {



    public static void main(String[] args) {

        Scanner khan=new Scanner(System.in);

        System.out.println("do you have a credit card");

        String creditcard=khan.next();

        if(creditcard.equalsIgnoreCase("yes")){

            System.out.println("how much is credit score");

            double balance=khan.nextDouble();

            if(balance>1300){

                System.out.println("you have to pay off immediately");

            }else{
                System.out.println("you are in a good standing");
            }

        }else if(creditcard.equalsIgnoreCase("no")){

            System.out.println("do you want to apply for one");

        }else{
            System.out.println("invalid input");
        }








    }
}
