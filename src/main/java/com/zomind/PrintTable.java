package com.zomind;
import java.util.Scanner;
public class PrintTable {
    public static void printTable(int a) {
        int b = 1;
        int tab;

        System.out.println("table of " + a);
        do {
            tab = a*b;
            System.out.print(tab+",");
            b++;

        } while (b<=10);
    }
            public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number for which we want to print table");
            System.out.print("number=");
            int num = sc.nextInt();
            printTable(num);
        }
    }
