package com.example;




public class ListExecutor {

    public static void main(String[] args) {

        List list = new List();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list.indexOf(30));
        System.out.println(list.contains(70));


    }
}