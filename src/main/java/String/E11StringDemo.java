package Class.String;

public class E11StringDemo {
    public static void main(String[] args) {

        String s="Java is fun and i ,love to play with java";

        String [] strArr=s.split(",");
        System.out.println(strArr.length);
        for(String m:strArr) {
            System.out.println(m);
            System.out.println(m.trim());


        }

    }
}
