public class Logicaland {
    public static void main(String[] args) {

        int num1 = 45;
        int num2 = 31;
        int num3 = 11;

        if(num1>num2&&num1>num3){
            System.out.println(num1+"is the largest one");

        }else if(num2>num1 && num2>num3){
            System.out.println(num2+"num2 is the largest one");

        }else if(num3>num1 && num3>num2){
            System.out.println(num3+"is the largest one");


            // logical or

            boolean exercise = true;
            boolean sleep = false;

            if(exercise || sleep){
                System.out.println("if i wake up i will go to run");

            }else{
                System.out.println("otherwise i am sleeping");
            }
        }

    }
}
