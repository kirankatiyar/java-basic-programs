package com.zomind;
import java.util.Scanner;
public class TackcharacterFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your character");
        char s = sc.next().charAt(0);
        System.out.println("Your Character is= "+s);
    }
}
