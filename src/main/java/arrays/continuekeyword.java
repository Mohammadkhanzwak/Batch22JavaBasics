package arrays;

public class continuekeyword {

    public static void main(String[] args) {

        int [] numbers={34,78,8,8,54,75,45,68,887,546,3,4,6,8,54,7,152,5,1,2,52,5,5};

        for(int i=0; i<numbers.length; i++){

            if(numbers[i]%2==0) {

                continue;

            }

            System.out.println(numbers[i]);
        }
    }
}
