package LAB.String;

import java.util.*;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String res = "";

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            boolean found = false;

            for (int j = 0; j < res.length(); j++) {

                if (c == res.charAt(j)) {

                    found = true;
                    break;
                }
            }

            if (!found) {

                res += c;
            }
        }

        System.out.println(res);
    }
}