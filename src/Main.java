public class Main {
    public static void main(String[] args) {
        int[] rainfall = {30, 40, 45, 95, 130, 220, 210, 185, 135, 80, 40, 45};

        int totalRainFall = 0;
        for (int j : rainfall) {
            totalRainFall += j;
        }

        System.out.println("Total Rainfall: " + totalRainFall);
        System.out.println("Average Rainfall: " + (double) totalRainFall / rainfall.length);
    }
}