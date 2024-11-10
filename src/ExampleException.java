public class ExampleException {

    public static int rectangleArea(int a, int b) {
        // TODO put your code here
        // I would rather check the parameters is strictly greater than 0
        // but it looks like it is possible to have 0-area rectangle conceptually
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException(String.format("(a=%d;b=%d) input value is below zero!", a, b));
        }
        return a*b;
    }
}