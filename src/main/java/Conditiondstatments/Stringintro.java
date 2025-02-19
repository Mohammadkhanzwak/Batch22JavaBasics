package Conditiondstatments;
import java.util.Scanner;
public class Stringintro {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter your name");
        String Name=input.nextLine();

        System.out.println("your name is "+Name);
        System.out.println("please enter your age");

        int age=input.nextInt();
        System.out.println("your age is "+age);

        System.out.println("what school are you studing in");
        String school=input.next();

        System.out.println("what grad are you in");
        char grade=input.next().charAt(0);

        System.out.println("you are studing at "+school+" your grad is "+grade);

        System.out.println("are you enjoying studing at "+school+"please enter.trur/false");
        boolean enjoing=input.nextBoolean();
        System.out.println("i am enjoing studing at "+school+" "+enjoing);
        input.close();








    }
}
