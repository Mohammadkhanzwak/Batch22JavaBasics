package Class.String;

public class E10StringDemo {
    public static void main(String[] args) {

        String s="Java is fun . and i love to learn java";

        String [] sArr= s.split(" ");
        System.out.println(sArr.length);


        for(String m:sArr){
            System.out.println(m);
            System.out.println(m.trim());
        }
    }
}
