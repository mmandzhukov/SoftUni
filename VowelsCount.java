
import java.util.Scanner;

public class VowelsCount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();


        countOfVowels(word);
        int numberOfVowels = countOfVowels(word);
        System.out.println(numberOfVowels);
//        printer(numberOfVowels);

    }


    private static int countOfVowels(String word) {

        int counter = 0;

        for (int i = 0; i < word.length(); i++) {


            if (word.toLowerCase().charAt(i) == 'a' || word.toLowerCase().charAt(i) == 'e' || word.toLowerCase().charAt(i) == 'i' || word.toLowerCase().charAt(i) == 'o' || word.toLowerCase().charAt(i) == 'u') {
                counter++;
            }
        }
        return counter;
    }

    private static void printer(int numberOfVowels) {

        System.out.println(numberOfVowels);
    }
}



