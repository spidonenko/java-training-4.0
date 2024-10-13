package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line
    static String name = "";

    public static void main(String[] args) {
        greet("Hall-e 9001", "2024"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        finalTest();
        end();
        scanner.close();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }

    static void remindName() {
        System.out.println("Please, remind me your name.");
        name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");
        checkAnswer(2);
    }
    static void finalTest() {
        System.out.println("Dave, .. sorry, " + name + ", do you liked this quiz?\n" +
                "1. Yes.\n" +
                "2. No.\n" +
                "3. Don't know yet.");
        checkAnswer(1);
    }
    static void checkAnswer(final int correctAnswer){
        while (true){
            int answer = scanner.nextInt();
            if (answer == correctAnswer){
                System.out.println("Great!");
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
