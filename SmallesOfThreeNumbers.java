import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallesOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int number = Integer.parseInt(scan.nextLine());
            numbers.add(number);
        }

        lowestNumber(numbers);
        int lowestOf3 = lowestNumber(numbers);

        print(lowestOf3);
    }


    private static int lowestNumber(List<Integer> num) {
        int lowestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < num.size(); i++) {

            int tempListNumber = num.get(i);
            if (tempListNumber < lowestNumber) {
                lowestNumber = num.get(i);

            }
        }
        return lowestNumber;
    }

    private static void print(int lowestOf3) {
        System.out.println(lowestOf3);
    }
}
