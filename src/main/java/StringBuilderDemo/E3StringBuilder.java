package StringBuilderDemo;

public class E2StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Delawar");

        sb.insert(2,'s');
        System.out.println(sb);
        sb.delete(0,4); 
        System.out.println(sb);

    }
}
