package arrays;

public class twodimensionalArrays {

    public static void main(String[] args) {

        int [][] scores=new int[2][3];

        // row 1

        scores[0][0]=70;
        scores[0][1]=75;
        scores[0][2]=99;


        //row 2

        scores[1][0]=80;
        scores[1][1]=97;
        scores[1][2]=100;

        System.out.println(scores[1][1]);

        System.out.println((scores[1][0]+scores[1][1]+scores[1][2])/3);


        // short way of two dimensional arrays

        int [][] numbers={
                {23,44,77},
                {77,88,45},
                {345,334,54}


        };

        System.out.println(numbers[1][2]);
    }
}
