package basic;

import java.util.Scanner;

public class Area_Of_A_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side : ");
        int side = sc.nextInt();
        int square = side * side;
        System.out.println("Area of the sqare is : " + square);
    }
}
