package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameMovie = scanner.nextLine();
        int timeMovieEpisode = Integer.parseInt(scanner.nextLine());
        int timeBreak = Integer.parseInt(scanner.nextLine());

        double timeLunch = timeBreak * (1 * 1.0 /8);
        double relaxTime = timeBreak * (1 * 1.0 / 4);

        double freeTime = timeBreak - (timeLunch + relaxTime);
        double diff = Math.abs(freeTime - timeMovieEpisode);
        if (freeTime >= timeMovieEpisode){

            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameMovie, Math.ceil(diff));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameMovie, Math.ceil(diff));
        }

    }
}
