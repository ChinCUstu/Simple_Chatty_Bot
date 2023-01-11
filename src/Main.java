import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Ricky");
        System.out.println("I was created in 2023");
        System.out.println("Please, remind me your name.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("What a great name you have, " + name + "!");
    }
}

