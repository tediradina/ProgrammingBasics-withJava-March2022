package FirstStepsInCoding_Exercises1;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.5;
        double paintPrice = (paint + (paint * 0.1)) * 14.5;
        double thinnerPrice = thinner * 5;

        double account = nylonPrice + paintPrice + thinnerPrice + 0.4;
        double moneyForMaster = account * 0.3;

        double totalMoneyForMaster = hours * moneyForMaster;

        double neededMoney = totalMoneyForMaster + account;

        System.out.println(neededMoney);
    }
}
