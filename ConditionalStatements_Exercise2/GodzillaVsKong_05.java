package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countExtras = Integer.parseInt(scanner.nextLine());
        double priceClothingExtra = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;

        double totalPriceForClothing = priceClothingExtra * countExtras;

        if (countExtras > 150){
            totalPriceForClothing = totalPriceForClothing - (totalPriceForClothing * 0.1);
        }

        double totalMoney = totalPriceForClothing + decor;

        double difference = Math.abs(budget - totalMoney);
        if (budget >= totalMoney){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference );
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }
    }
}
