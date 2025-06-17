package Class.String;

public class E7StringDemo {
    public static void main(String[] args) {
        String s="I am the luckiest guy on the planet";

        System.out.println(s.charAt(4));
         char c=s.charAt(2);
        System.out.println(c);

        for (int i = 0; i <s.length(); i++) {

            System.out.println(s.charAt(i));

        }
        int count=0;
        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)=='a'){

                count++;

            }

        }
        System.out.println(s.charAt(count));

    }
}
