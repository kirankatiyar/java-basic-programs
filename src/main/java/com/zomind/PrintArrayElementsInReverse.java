package com.zomind;
import java.util.Scanner;
public class PrintArrayElementsInReverse {
    static int[] a = new int[5];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("user enter 5 numbers ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for(int i=4;i>=0;i--)
            System.out.print(a[i]+",");
        }
    }
