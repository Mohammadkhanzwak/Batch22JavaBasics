public class switchstatment3 {

    public static void main(String[] args) {

        String electionyear="2024";

        switch(electionyear){

            case"2024":
                System.out.println("the president is biden");
                break;

            case"2017":
                System.out.println("the president is trump");
                break;

            case"2012":
                System.out.println("the president is obama");
                break;

            default:
                    System.out.println("the president is unknown");
                    break;
        }
    }
}
