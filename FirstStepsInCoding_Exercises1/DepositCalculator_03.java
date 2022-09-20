package FirstStepsInCoding_Exercises1;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double percentages = Double.parseDouble(scanner.nextLine());

        double totalMoney = deposit + month * ((deposit * (percentages / 100)) / 12);
        System.out.println(totalMoney);

    }
}
