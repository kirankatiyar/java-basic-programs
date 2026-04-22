package com.zomind;
import java.util.Scanner;
public class PrintArrayElements {
    static int[] a = new int[5];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("user enter 5 numbers ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print(a[i]+",");
        }
    }
}