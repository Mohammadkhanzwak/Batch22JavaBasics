package Class.String;

public class E6StringDemo {
    public static void main(String[] args) {
         String s="Java is fun";

        System.out.println(s.charAt(5));

        char c=s.charAt(6);
        System.out.println(c);
        for (int i = 0; i <s.length(); i++) {

            System.out.print(s.charAt(i)+" ");

            int count=0;

            for (int j= 0; i <s.length() ; i++) {

                if(s.charAt(i)=='v'){
                    count++;

                }

            }
            System.out.print(count);

        }

    }
}
