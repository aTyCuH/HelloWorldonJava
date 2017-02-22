package hello.world;

import java.util.Scanner;

public class hello {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter your name:");
        String name = input.nextLine();
        System.out.format("Hello, %s!%n", name);

        System.out.println("Please, enter your age:");
        int age = input.nextInt();
        System.out.format("Oh, you're %d! And you're an old man!%n", age);

        System.out.println("Please, enter your weight:");
        float weight = input.nextFloat();
        System.out.format("Oh, you're fat! Your weight is %1.2f%n", weight);

        input.close();
    }
}