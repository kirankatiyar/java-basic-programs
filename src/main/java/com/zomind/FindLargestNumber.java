package com.zomind;
import java.util.Scanner;
public class FindLargestNumber {
    static int[] a = new int[5];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("User enter 5 numbers");
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Largest Number=");
        int larg = a[0];
        for(int i=1;i<5;i++){
            if(larg<a[i]){
                larg=a[i];
            }
        }
        System.out.print(larg);
    }
}
