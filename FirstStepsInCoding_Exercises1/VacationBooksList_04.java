package FirstStepsInCoding_Exercises1;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPages = Integer.parseInt(scanner.nextLine());
        int readedPages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int neededHours = countPages / readedPages;
        int hoursForOneDay = neededHours / days;

        System.out.println(hoursForOneDay);

    }
}
