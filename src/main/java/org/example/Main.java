package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("---------------");
        System.out.println("1. a + b");
        System.out.println("2. a - b");
        System.out.println("3. a * b");
        System.out.println("4. |z|");
        System.out.println("5. arg(z)");
        System.out.println("0. Exit program");

        Scanner input = new Scanner(System.in);
        System.out.print("Choose (0-5): ");
        char choice = input.nextLine().charAt(0);
        switch (choice) {
            case '1' : {
                System.out.print("a: ");
                String aStr = input.nextLine();
                Complex a = new Complex(aStr);
                System.out.print("b: ");
                String bStr = input.nextLine();
                Complex b = new Complex(bStr);

                Complex c = a;
                c = c.add(b);

                System.out.println(aStr+" + "+bStr+" = "+c);

                break;
            }
            case '2' : {
                System.out.print("a: ");
                String aStr = input.nextLine();
                Complex a = new Complex(aStr);
                System.out.print("b: ");
                String bStr = input.nextLine();
                Complex b = new Complex(bStr);

                Complex c = a;
                c = c.subtract(b);

                System.out.println(aStr+" + "+bStr+" = "+c);

                break;
            }
            case '3' : {
                System.out.print("a: ");
                String aStr = input.nextLine();
                Complex a = new Complex(aStr);
                System.out.print("b: ");
                String bStr = input.nextLine();
                Complex b = new Complex(bStr);

                Complex c = a;
                c = c.multiply(b);

                System.out.println(aStr+" + "+bStr+" = "+c);

                break;
            }
            case '4' : {
                System.out.print("z: ");
                String aStr = input.nextLine();
                Complex z = new Complex(aStr);

                double abs = z.abs();

                System.out.println("|"+z+"| = "+abs);

                break;
            }
            case '5' : {
                System.out.print("z: ");
                String aStr = input.nextLine();
                Complex z = new Complex(aStr);

                double arg = z.angle();

                System.out.println("arg ("+z+") = "+arg);

                break;
            }
            case '0' : {}
            default: {}
        }
    }
}