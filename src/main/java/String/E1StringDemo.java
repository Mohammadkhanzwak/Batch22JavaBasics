package Class.String;

public class E1StringDemo {
    public static void main(String[] args) {

        String str=new String("Hello World");

        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(" Hello syntax"));
        int len=str.length();
        System.out.println(len);
        System.out.println(str.length()+len);

    }
}
