package Class.String;

public class E4StringDemo {
    public static void main(String[] args) {
        String s="Today is my lucky day t learn coding";

        System.out.println(s.startsWith("T"));
        System.out.println(s.endsWith("coding"));
        Boolean cond=s.startsWith("Today");
        System.out.println(cond);
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("Today"));

        if(s.startsWith("today")){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
}
