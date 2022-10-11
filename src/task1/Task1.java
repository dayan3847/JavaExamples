package task1;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("\u001B[34m" + "Lanzamiento 1");
        boolean[] coinTosses1 = {true, false, true, true, true, false, false, true, false, true};
        boolean result1 = haveAStreakOfFive(coinTosses1);
        if (result1) {
            System.out.println("\u001B[32m" + "El Lanzamiento 1 tiene racha de 5 caras consecutivas");
        } else {
            System.out.println("\u001B[31m" + "El Lanzamiento 1 no tiene racha de 5 caras consecutivas");
        }

        System.out.println("\u001B[34m" + "Lanzamiento 2");
        boolean[] coinTosses2 = {true, false, true, true, true, true, true, false, false, true};
        boolean result2 = haveAStreakOfFive(coinTosses2);
        if (result2) {
            System.out.println("\u001B[32m" + "El Lanzamiento 2 tiene racha de 5 caras consecutivas");
        } else {
            System.out.println("\u001B[31m" + "El Lanzamiento 2 no tiene racha de 5 caras consecutivas");
        }
    }

    public static boolean haveAStreakOfFive(boolean[] coinTosses) {
        boolean haveStreak = false;
        int numberOfConsecutiveTrues = 0;
        int i = 0;
        int count = coinTosses.length;
        while (i < count && !haveStreak) {
            if (coinTosses[i]) {
                numberOfConsecutiveTrues++;
                haveStreak = numberOfConsecutiveTrues >= 5;
            } else {
                numberOfConsecutiveTrues = 0;
            }
            i++;
        }
        return haveStreak;
    }
}
