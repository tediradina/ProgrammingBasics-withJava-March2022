package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstAthleteTime = Integer.parseInt(scanner.nextLine());
        int secondAthleteTime = Integer.parseInt(scanner.nextLine());
        int thirdAthleteTime = Integer.parseInt(scanner.nextLine());

        int sumTime = firstAthleteTime + secondAthleteTime + thirdAthleteTime;

        int minutes = sumTime / 60;
        int seconds = sumTime % 60;

        System.out.printf("%d:%02d", minutes, seconds);
    }
}
