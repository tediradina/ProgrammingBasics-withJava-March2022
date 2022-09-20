package FirstStepsInCoding_Exercises1;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChikenMenu = Integer.parseInt(scanner.nextLine());
        int countFishMenu = Integer.parseInt(scanner.nextLine());
        int countVegeterianMenu = Integer.parseInt(scanner.nextLine());

        double totalPriceForAllMenu = countChikenMenu * 10.35 + countFishMenu * 12.4 + countVegeterianMenu * 8.15;
        double priceDessert = totalPriceForAllMenu * 0.2;

        double account = totalPriceForAllMenu + priceDessert + 2.5;

        System.out.println(account);


    }
}
