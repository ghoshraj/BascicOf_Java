package basic;

import java.util.Scanner;

public class NoteCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount ---> ");
        int amount = sc.nextInt();
        if(amount >= 2000){
            System.out.println("2000 X "+ (amount/2000));
            amount = amount % 2000;
        }
        if (amount >= 500){
            System.out.println("500 X " + (amount/500));
            amount = amount % 500;
        }
        if (amount >= 200){
            System.out.println("200 X " + (amount/200));
            amount = amount % 200;
        }
        if (amount >= 100){
            System.out.println("100 X " + (amount/100));
            // amount = amount % 100;
        }
    }
}

