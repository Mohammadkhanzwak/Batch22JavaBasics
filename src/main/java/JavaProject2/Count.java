package JavaProject2;

public class Count {
    public static void main(String[] args) {

        String str = "Hello. World";

// Split the string by "." followed by optional spaces to count sentences
        String[] strArr = str.split("\\.\\s*");
        System.out.println(strArr.length);

}
  }