
import java.util.Scanner;
public class loopsandscanner2 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("please enter your grade for the year");

        int count=scan.nextInt();

        int sum=0;
         for(int i=1; i<=count; i++){

             System.out.println("what grade did you win in school");

             sum=sum+scan.nextInt();

         }
        System.out.println("i want all the result of this year examination = "+sum);

    }
}
