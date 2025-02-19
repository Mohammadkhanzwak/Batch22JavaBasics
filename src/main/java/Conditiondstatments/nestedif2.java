package Conditiondstatments;

public class nestedif2 {
    public static void main(String[] args) {
        boolean customer=true;
        double dailypurchaseamount=45;

        if(customer){

            if(dailypurchaseamount>50){
                System.out.println("youa are getting %13 discount");
            }else{
                System.out.println("youa are getting %9 discount");
            }
            if(dailypurchaseamount<50){
                System.out.println("youa are getting %3 discount");
            }
        }else{
            System.out.println("youa re not going to get any discount");

        }
    }
}
