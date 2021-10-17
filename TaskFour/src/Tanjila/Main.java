package Tanjila;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();

        System.out.print(" Please enter a number for Dividor Sum:  ");
        int x = input.nextInt();
        System.out.println(" The Sum of the Divisors is = " +calculator.divisorSum());

        System.out.print(" Please enter a number for Factorial: ");
        x = input.nextInt();
        System.out.println("The Factorial of the number is = " );
        calculator.void findFactorial();


    }
}

