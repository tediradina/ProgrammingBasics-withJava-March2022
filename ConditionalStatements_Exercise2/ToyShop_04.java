package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceЕxcursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totalCountToys = puzzles + talkingDolls + teddyBears + minions + trucks;

        double totalMoney = puzzles * 2.6 + talkingDolls * 3 + teddyBears * 4.1 + minions * 8.2 + trucks * 2;

        if (totalCountToys >= 50){
            totalMoney = totalMoney - (totalMoney * 0.25);
        }

        double rent = totalMoney * 0.1;

        double moneyЕarned = totalMoney - rent;

        double money = Math.abs(priceЕxcursion - moneyЕarned);

        if (moneyЕarned >= priceЕxcursion){
            System.out.printf("Yes! %.2f lv left.", money);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", money);
        }

    }
}
