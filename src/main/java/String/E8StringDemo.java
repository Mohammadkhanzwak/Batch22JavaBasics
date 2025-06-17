package Class.String;

public class E8StringDemo {

    public static void main(String[] args) {

        String s=" hello java i am the guy that have problem with you";

        String m=s.substring(0);
        System.out.println(s.substring(1,11));

        String m1=s.substring(3,9);
        System.out.println(m1);
        System.out.println(s.length());
        String m2=s.substring(35,51);
        System.out.println(m2);
        System.out.println(s.trim());
        System.out.println(s.replace("java","coding"));


    }
}
