package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordTime = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double swimTimeFor1M = Double.parseDouble(scanner.nextLine());

        double totalTimeWithoutDelay = swimTimeFor1M * distance;
        double totalTimeWithDelay = totalTimeWithoutDelay + ((Math.floor(distance / 15)) * 12.5);

        double diff = Math.abs(recordTime - totalTimeWithDelay);
        if (recordTime <= totalTimeWithDelay){
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeWithDelay);
        }

    }
}
