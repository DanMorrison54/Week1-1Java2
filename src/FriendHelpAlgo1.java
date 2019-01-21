import java.util.Scanner;

public class FriendHelpAlgo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String test;
        do {
            System.out.println("input valid student ID ");
            test = scan.nextLine();

            try {
                if (test.toCharArray()[2] != '-') {

                    System.out.println("invalid id no dash(-) at third character");
                    test="0000";
                    continue;

                }

            } catch (Exception e) {

            }
            if (test.length() > 8) System.out.println("invalid id, it's greater than 8 characters long");
            if (test.length() < 8) System.out.println("invalid id, it's too short");

        } while (test.length() != 8);
    }
}
