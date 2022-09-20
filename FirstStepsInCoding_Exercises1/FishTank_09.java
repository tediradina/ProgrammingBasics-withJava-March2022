package FirstStepsInCoding_Exercises1;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        // лице в сантиметри
        double area = length * width * height;

        double freeSpace = area - (area * (percent / 100));

        // свободно място в дециметри
        double neededWater = freeSpace / 1000;

        System.out.println(neededWater);
        
    }
}
