package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double priceVideoCard = videoCard * 250;
        double priceProcessors = (priceVideoCard * 0.35) * processors;
        double priceRamMemory = (priceVideoCard * 0.1) * ramMemory;

        double total = priceVideoCard + priceProcessors + priceRamMemory;
        if (videoCard > processors){
            total = total - (total * 0.15);
        }

        double diff = Math.abs(budget - total);
        if (budget >= total){
            System.out.printf("You have %.2f leva left!", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}
