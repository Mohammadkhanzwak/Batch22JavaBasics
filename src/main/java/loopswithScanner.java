import java.util.Scanner;
import java.util.Scanner;
public class loopswithScanner {

    public static void main(String[] args) {

      Scanner scan= new Scanner(System.in);

        System.out.println("please enter how many numbers you would like");

        int counter=scan.nextInt();

        int sum=0;

        for(int i=1; i<=counter; i++){
            System.out.println("please enter a number");

            sum=sum+scan.nextInt();


        }

        System.out.println(" the sum of all numbers ="+sum);

    }
}

//another loops combination with scanner


