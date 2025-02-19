package Conditiondstatments;

public class nestedIf {
    public static void main(String[] args) {

        boolean member=false;
        double purchaseamount=100;

        if(member){


            if(purchaseamount>90){
                System.out.println("you are getting %10 discount");
            }else{
                System.out.println("otherwise you are getting %5 discount");
            }

        }else{

            if(purchaseamount>90){
                System.out.println("you are getting %3 discount");
            }else{
                System.out.println("otherwise you are not getting any discount");
            }


        }
    }
}
