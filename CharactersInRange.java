import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char char1 = scan.nextLine().charAt(0);
        char char2 = scan.nextLine().charAt(0);

        numberCounter(char1, char2);
        List<Integer> listWithNumbers = numberCounter(char1, char2);

        printer(listWithNumbers);
    }


    private static List<Integer> numberCounter(char char1, char char2) {

        List<Integer> listWithNumbers = new ArrayList<>();

        int char1ToNumber = (int) char1;
        int counter = char1ToNumber;
        int char2ToNumber = (int) char2;
        int target = char1ToNumber;

        while (target != char2ToNumber) {
            target++;
            listWithNumbers.add(target);
        }

        return listWithNumbers;
    }

    private static void printer(List<Integer> list) {


        for (int i = 0; i < list.size() - 1; i++) {
            int tempNumber = list.get(i);
            char ascii = (char) tempNumber ;
            System.out.print(ascii + " ");
        }

    }
}

