import java.util.Scanner;

public class scannerintro {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your age");

        int age=sc.nextInt();
        System.out.println("your age is "+age);

        System.out.println("please enter your full name");
        String fullName=sc.next();
        System.out.println("your full name is "+fullName);

        System.out.println("what school are you studing in");

        String school=sc.next();

        System.out.println("what is your grade");

        char grade=sc.next().charAt(0);
        System.out.println("you are studing at "+ school + " and your grade is "+grade);

        System.out.println("are you you enjoing coding at "+school+"please enter true/false");
        boolean enjoying=sc.nextBoolean();
        System.out.println("i am enjoying coding at "+school +enjoying);
        sc.close();
    }
}
