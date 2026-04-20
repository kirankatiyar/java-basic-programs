package com.zomind;

public class SumOfFirst10NaturalNumbers {
    public static void main(String[] args){
        int i;
        int sum1=0;
        System.out.println("Sum of first 10 Natural numbers");
        for(i=1;i<=10;i++){
            sum1=sum1+i;
        }
        System.out.print(sum1);
    }
}
