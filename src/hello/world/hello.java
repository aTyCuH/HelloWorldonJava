package hello.world;

import java.util.Scanner;

public class hello {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter your name:");
            String name = input.nextLine();
            System.out.format("Hello, %n", name);

            System.out.println("Please enter your age:");
            int age = input.nextInt();
            System.out.format("Oh , you`re !  and you old %n", age);

            System.out.println("Please enter your age:");
            float weight = input.nextFloat();
            System.out.format("Oh , you`re fat  and you old", weight);


        }

}
