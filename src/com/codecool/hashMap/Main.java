package com.codecool.hashMap;

import com.codecool.hashMap.implementation.MyHashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.add("random", 123);

        myHashMap.add("we are number one", 1);
        myHashMap.add("we are number two", 2);
        myHashMap.remove("we are number one");
        myHashMap.remove("we are number 1");
        myHashMap.getValue("we are number two");
        myHashMap.getValue("random");
        myHashMap.clearAll();
        myHashMap.getValue("we are number two");
    }
}
