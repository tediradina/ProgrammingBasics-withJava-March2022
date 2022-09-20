package FirstStepsInCoding_Exercises1;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPack = Integer.parseInt(scanner.nextLine());
        int markerPack = Integer.parseInt(scanner.nextLine());
        int cleanerLiters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double totalPriceWithoutDiscount = (penPack * 5.80) + (markerPack * 7.2) + (cleanerLiters * 1.2);
        double totalPrice = totalPriceWithoutDiscount - (totalPriceWithoutDiscount * (discount * 1.0 / 100));

        System.out.println(totalPrice);
    }
}
