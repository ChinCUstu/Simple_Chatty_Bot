import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Ricky");
        System.out.println("I was created in 2023");
        System.out.println("Please, remind me your name.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        byte remainder3 = scanner.nextByte();
        byte remainder5 = scanner.nextByte();
        byte remainder7 = scanner.nextByte();
        int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");

    }
}

