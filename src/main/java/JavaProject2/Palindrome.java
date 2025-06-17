package JavaProject2;

public class Palindrome {
    public static void main(String[] args) {
        String str="madam";

        if(isPalindrome(str)){
            System.out.println(str+ " is a Palindrome.");


        }else{
            System.out.println(str+ "is a Palindrome.");
        }
    }
    public static boolean isPalindrome(String str){
        String reversed="";
        for (int i =str.length()-1; i>= 0; i--) {
            reversed +=str.charAt(i);

        }
        return str.equals(reversed);
    }
}
