package Conditiondstatments;

public class nestedifelse {
    public static void main(String[] args) {
        boolean exercise=true;
        boolean running=true;
        if(exercise){
            System.out.println("you are good for today");

            if(running){
                System.out.println("you are getting better");
            }else{
                if(running){
                    System.out.println("you have to do some hard work");
                }
            }
        }else{
            System.out.println("you have to follow your schedule");

            boolean championship=true;
            boolean race=true;

            if(championship){
                System.out.println("you have won the championship");

                if(race){
                    System.out.println("you are a good runner");
                }else{
                    System.out.println("you just failed to win the race");
                }
            }else{
                System.out.println("you will work a lot to be a champion");


            }
        }
    }
}
