package Class.String;

public class E2StringDemo {

    public static void main(String[] args) {

        String s="Hello my dear class mate";
        System.out.println(s.isEmpty());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.concat("Hello dear"));

        System.out.println(s.length()+s.concat("Hello dear"));
        Boolean cond=s.isEmpty();

        if(cond){

            System.out.println("The string is empty");
        }else{
            System.out.println("The string is not empty");
        }
    }
}
