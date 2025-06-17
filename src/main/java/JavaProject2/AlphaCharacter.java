package JavaProject2;

public class AlphaCharacter {
    public static void main(String[] args) {

        String Alpha="Hello I wanna check the Alpha Number of the String Class it ### Took **** About 12 Hour to find out Asghar Will go to hell for this project";

        int a=0;

        for (int i = 0; i <Alpha.length(); i++) {

            if(Character.isLetter(Alpha.charAt(i))){
                a++;


            }

        }
        System.out.println("Number of Alpha Character "+a);
    }
}
