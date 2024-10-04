// This variant is created after the Q&A session
//  to match the solution in the lecture

import java.util.Scanner;

public class SeasonExample0 {
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static Season getSeason(String month) {
        switch (month.toUpperCase()) {
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY":
                return Season.WINTER;
            case "MARCH":
            case "APRIL":
            case "MAY":
                return Season.SPRING;
            case "JUNE":
            case "JULY":
            case "AUGUST":
                return Season.SUMMER;
            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
                return Season.AUTUMN;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var season = getSeason(sc.nextLine());
        System.out.println(season != null ? season : "Cannot resolve the Season!");
        sc.close();
    }
}
