import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String moveA;
        String moveB;
        String playerA;
        String playerB;
        String R;
        String P;
        String S;
                // --- Player A Input ---
                System.out.println("Player A enter move:");
                playerA = in.nextLine(); // Declared and assigned here

                // Validate Player A's input
                if (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))) {
                    System.out.println("You have entered an invalid string: " + playerA);
                    System.out.println("Run the program again and enter one of the 6 choices.");
                    System.exit(0);
                }

                // --- Player B Input ---
                System.out.println("Player B enter move:");
                 playerB = in.nextLine(); // Declared and assigned here

                // Validate Player B's input
                if (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))) {
                    System.out.println("You have entered an invalid string: " + playerB);
                    System.out.println("Run the program again and enter one of the 6 choices.");
                    System.exit(0);
                }

                // Convert choices to uppercase for easier comparison (no "String" keyword here)
                 moveA = playerA.toUpperCase();
                 moveB = playerB.toUpperCase();

                // --- Game Results ---
                if (moveA.equals(moveB)) {
                    System.out.println(moveA + " vs " + moveB + " it’s a Tie!");
                } else if (moveA.equals("R")) {
                    if (moveB.equals("S")) {
                        System.out.println("Rock breaks Scissors. Player A wins!");
                    } else {
                        System.out.println("Paper covers Rock. Player B wins!");
                    }
                } else if (moveA.equals("P")) {
                    if (moveB.equals("R")) {
                        System.out.println("Paper covers Rock. Player A wins!");
                    } else {
                        System.out.println("Scissors cuts Paper. Player B wins!");
                    }
                } else if (moveA.equals("S")) {
                    if (moveB.equals("P")) {
                        System.out.println("Scissors cuts Paper. Player A wins!");
                    } else {
                        System.out.println("Rock breaks Scissors. Player B wins!");
                    }
                }
            }
        }
}
