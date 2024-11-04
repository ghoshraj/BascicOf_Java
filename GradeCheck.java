package basic;

import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if(num >= 0 && num <= 34){
            System.out.println("Pass");
        }
        else if (num >= 35 && num <= 45){
            System.out.println("Average");
        }
        else if (num >= 46 && num <= 70){
            System.out.println("Good");
        }
        else if (num >= 71 && num <= 89){
            System.out.println("Very Good");
        }
        else {
            System.out.println("Outstanding");
        }
    }
}
