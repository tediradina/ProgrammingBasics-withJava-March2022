package FirstStepsInCoding_Lab1;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPackagesOfDogFood = Integer.parseInt(scanner.nextLine());
        int countPackagesOfCatFood = Integer.parseInt(scanner.nextLine());

        double moneyNeeded = countPackagesOfCatFood * 4 + countPackagesOfDogFood * 2.5;
        System.out.println(moneyNeeded + " lv.");

    }
}
