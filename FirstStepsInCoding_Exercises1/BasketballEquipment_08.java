package FirstStepsInCoding_Exercises1;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = fee * 0.6;
        double teamPrice = sneakersPrice * 0.8;
        double ballPrice = teamPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.2;

        double total = fee + sneakersPrice + teamPrice + ballPrice + accessoriesPrice;

        System.out.println(total);

    }
}
