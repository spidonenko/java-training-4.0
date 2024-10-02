import java.util.Scanner;

public class SeasonExample {

    public enum Month {
        JAN(1, "January", "Winter"),
        FEB(2, "February", "Winter"),
        MAR(3, "March", "Spring"),
        APR(4, "April", "Spring"),
        MAY(5, "May", "Spring"),
        JUN(6, "June", "Summer"),
        JUL(7, "July", "Summer"),
        AUG(8, "August", "Summer"),
        SEP(9, "September", "Autumn"),
        OCT(10, "October", "Autumn"),
        NOV(11, "November", "Autumn"),
        DEC(12, "December", "Winter");

        public final Integer num;
        public final String label;
        public final String season;

        Month(Integer num, String label, String season) {
            this.num = num;
            this.label = label;
            this.season = season;
        }

        public static Month valueOf(Integer num) {
            for (Month e : values()) {
                if (e.num.equals(num)) {  return e; }
            }
            return null;
        }

        @Override
        public String toString() {
            return String.format("%d. %s", this.num, this.label);
        }
    }

    public static void main(String[] args) {

        System.out.println("Here is a list of the months:");
        for (var i : Month.values()) {
            System.out.printf("%s, ", i);
        }
        // Reading the data
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the month number > ");
        Month month = Month.valueOf(scanner.nextInt());
        scanner.close();

        // Solution 1 (plain simple - just read the attributes)
        if (month == null) {
            System.err.println("ERROR: Wrong month number");
            return;
        } else {
            System.out.printf("Solution 1: %s is %s's month.%n", month.label, month.season);
        }

        // Solution 2 (switch case - probably the correct one)
        String season;
        switch (month) {
            case DEC:
            case JAN:
            case FEB:
                season = "Winter";
                break;
            case MAR:
            case APR:
            case MAY:
                season = "Spring";
                break;
            case JUN:
            case JUL:
            case AUG:
                season = "Summer";
                break;
            case SEP:
            case OCT:
            case NOV:
                season = "Autumn";
                break;
            default:
                System.err.println("ERROR: This shouldn't happened");
                return;
        }
        System.out.printf("Solution 2: %s is %s's month.%n", month.label, season);
    }
}
