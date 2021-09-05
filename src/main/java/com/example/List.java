package com.example;

import java.util.NoSuchElementException;

public class List {

    private class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node first;
    public Node last;
    private int size;

    public void addLast(int item) {
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }
    public void addFirst ( int item){
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;

    }
    public int indexOf(int item) {
    int index = 0;
     Node current = first;
    while (current != null){
        if (current.value == item){ return index;}
        current = current.next;
        index++;
    }
    return -1;
    }
    public void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else{
            Node second = first.next;
            first.next = null;
            first =second;
        }
        size --;
    }

    public boolean contains(int item){
        return indexOf(item)!= -1;
    }


    public void removeLast(){
        if(isEmpty()) throw new NoSuchElementException();

        Node previous =  getPrevious(last);
        if (first == last)
            first = last = null;
        else {
            last = previous;
            previous.next = null;
        }

        size--;
    }
    public int size(){
    return size;
    }
    public int[] toArray(){
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return  array;
    }

    public void reverse(){
        if(isEmpty()) return;
        Node previous = first;
        Node current = previous.next;
        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;

    }

    private Node getPrevious(Node node){
        Node current = first;
        while(current != null){
            if(current.next == node)
            return current;
            current = current.next;
        }
        return null;
    }
    public int getKthfromTheEnd(int k){

        if (isEmpty()) throw new IllegalStateException();
        Node a = first;
        Node b = first;
        for (int i = 0; i < k-1;i++){
            b = b.next;
            if (b == null) throw new IllegalArgumentException();
        }
        while(b.next != null){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
