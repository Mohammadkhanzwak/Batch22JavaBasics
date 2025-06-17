package Class.String;

import java.sql.SQLOutput;

public class E9StringDemo {

    public static void main(String[] args) {

        String str="          SDJCNSKJNDSK238732@@@###$$$$";
        System.out.println(str.replaceAll("[A-Z]","#"));

        System.out.println("***********************");
        System.out.println(str.replaceAll("[^A-Z]",""));
        System.out.println("sdjfdvjdfsjdfjdfsjdfjdfjdsjfdjdf");
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[0-9A-Za-z]","*"));
        System.out.println(str.replaceAll(" ", ""));
    }
}
