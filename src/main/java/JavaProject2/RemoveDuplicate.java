package JavaProject2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
     ArrayList<String> list =new ArrayList<>(Arrays.asList("apple", "banana","orange","banana"));
        ArrayList<String> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(uniqueList);
    }

}
