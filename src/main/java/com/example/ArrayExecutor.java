package com.example;



public class ArrayExecutor {
    
    public static void main(String[] args) {
        Array numbers = new Array(4);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(40);
        numbers.insert(80);
        System.out.println(numbers.firstDuplicate());

    }
}
