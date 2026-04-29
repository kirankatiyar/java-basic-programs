package com.zomind;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        int a=5;
        int n=0;
        System.out.println("number is = "+a);
           for(int i=2;i<a;i++){
               if(a%i==0){
                   n=n+1;
                   break;
               }
           }
           if(n==1){
               System.out.println("not prime number");
           }
           else {
               System.out.println("prime number");
           }

    }
}