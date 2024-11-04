package basic;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'A' || ch == 'a' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i'
                || ch == 'o' || ch == 'O' || ch =='U' || ch =='u'){
            System.out.println("Vowels");
        }
        else {
            System.out.println("Consonent");
        }
    }
}

