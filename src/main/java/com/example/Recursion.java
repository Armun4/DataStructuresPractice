package com.example;

public class Recursion {
    public  static void main(String[] args){

    }

    public int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }
}
