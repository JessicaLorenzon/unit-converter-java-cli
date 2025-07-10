package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose the magnitude you want to convert? [1.Length / 2.Weight / 3.Temperature] ");
        int magnitude = scanner.nextInt();

        switch (magnitude) {
            case 3:
                System.out.print("Enter the temperature to convert: ");
                double magnitudeValue = scanner.nextDouble();
                System.out.println("Unit to convert from [1.Celsius / 2.Fahrenheit / 3.Kelvin] " );
                int magnitudeFrom = scanner.nextInt();
                System.out.println("Unit to convert to [1.Celsius / 2.Fahrenheit / 3.Kelvin] " );
                int magnitudeTo = scanner.nextInt();


        }


        scanner.close();
    }

    public void converter() {

    }
}
