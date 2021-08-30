package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// java program to print the fibonacci series
    int a = 0;
    int b = 1;
    int c;
        System.out.println("The fibonacci series is");
    for(int i=0;i<=7;i++){
        c = a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }


    }
}
