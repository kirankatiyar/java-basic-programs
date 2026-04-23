package com.zomind;
import java.util.Scanner;
public class FindMaximumElementInArray {
    public static void main(String[] args){
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("User enter elements");
        for(int i=0;i<5;i++){
            a[i]= sc.nextInt();
        }
        int max=a[0];
        for(int j=1;j<=4;j++){
            if(a[j]>max){
                max=a[j];
            }
        }
        System.out.print("maximum element =  "+max);

    }
}
