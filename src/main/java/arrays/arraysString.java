package arrays;

public class arraysString {

    public static void main(String[] args) {

        String [] tribes={"pashton","hazara","tajik","uzbek"};

        System.out.println(tribes[0]);
        System.out.println(tribes[1]);
        System.out.println(tribes[2]);
        System.out.println(tribes[3]);

        int size=tribes.length;
        System.out.println(size);

        for(int i=0; i<size; i++){

            System.out.println(tribes[i]);
        }
    }
}
