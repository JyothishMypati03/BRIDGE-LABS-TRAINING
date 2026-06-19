package LAB.String;
import java.util.Scanner;

public class FindFirstNonepeatedCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {

            int count = 0;

            for (int j = 0; j < input.length(); j++) {

                if (input.charAt(i) == input.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {

                System.out.println(input.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeated character found");
    }
}
