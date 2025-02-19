package Conditiondstatments;

public class Ifstatments {
    public static void main(String[] args) {

        boolean tired=true;
        if(tired){
            System.out.println("i need to rest");

            boolean sick=true;
            if(sick){
                System.out.println("i need to visit my doctor");
            }else {
                System.out.println("i am ready to play football");
            }
        }
    }
}
