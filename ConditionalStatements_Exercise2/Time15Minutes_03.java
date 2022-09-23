package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class Time15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sumMinutes = hours * 60 + minutes + 15;

        int newHours = sumMinutes / 60;
        int newMinutes = sumMinutes % 60;

        if (newHours == 24){
            newHours = 0;
        }
        System.out.printf("%d:%02d", newHours, newMinutes);

    }
}
