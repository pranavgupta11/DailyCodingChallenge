import java.util.Arrays;
import java.util.Scanner;

public class JioChallenge {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numberOfTestcases = input.nextInt();
        for (int k = 0; k < numberOfTestcases; k++) {

            int number = input.nextInt();
            System.out.println(number + "");

            // Scanner input = new Scanner(System.in);
            int[] players_energy = new int[number];
            int[] villain_strength = new int[number];

            for (int i = 0; i < villain_strength.length; i++) {
                System.out.println("Please enter villain strengths ");
                villain_strength[i] = input.nextInt();
            }

            for (int i = 0; i < players_energy.length; i++) {
                System.out.println("Please enter player energies ");
                players_energy[i] = input.nextInt();
            }

            for (int i = 0; i < players_energy.length; i++) {
                System.out.println("player energies are " + players_energy[i] + "");
            }
            for (int i = 0; i < villain_strength.length; i++) {
                System.out.println("villain strengths are " + villain_strength[i] + "");
            }
            Arrays.sort(players_energy);
            Arrays.sort(villain_strength);

            for (int i = 0; i < players_energy.length; i++) {
                System.out.println("player energies after sorting are " + players_energy[i] + "");
            }
            for (int i = 0; i < villain_strength.length; i++) {
                System.out.println("villain strengths after sorting are " + villain_strength[i] + "");
            }
            boolean result = true;
            for (int i = 0; i < number; i++) {
                if (players_energy[i] > villain_strength[i]) {
                    result = true;
                } else {
                    result = false;
                }
            }
            if (result) {
                System.out.println("WIN");
            } else {
                System.out.println("LOSE");
            }

        }
    }
}
