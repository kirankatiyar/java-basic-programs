package com.zomind;
import java.util.Scanner;
public class TakeStringFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your String ");
        String st = sc.next();
        System.out.println("your name is ..."+st);
        int len = st.length();
        System.out.println("Your name length is "+len);


    }
}
