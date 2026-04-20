package com.zomind;
import java.util.Scanner;
public class FindSmalestNumber {
    public static void main(String[] args){
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("User enter 5 number ");
        for(int i =0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Smalest number=");
        int small = a[0];
        for(int i=1;i<5;i++){
            if(small>a[i]){
                small=a[i];
            }
        }
        System.out.print(small);
    }
}
