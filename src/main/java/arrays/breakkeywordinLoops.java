package arrays;

public class breakkeywordinLoops {

    public static void main(String[] args) {

        String[] cars = {"toyota", "benz", "bmw", "ford", "volvo", "tesla"};

        for (String car : cars) {

            System.out.println(car);

            if (car.equals("ford")) {
                break;

            }
        }
    }
}