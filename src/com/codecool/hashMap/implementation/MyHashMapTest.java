package com.codecool.hashMap.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {


    @Test
    public void isAddAndGetWorking(){
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.add("test", 1);
        int value = myHashMap.getValue("test");
        assertEquals(1, value);
    }

    @Test
    public void doesSameKeyThrowsException(){
        assertThrows(IllegalArgumentException.class, ()->{
            MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
            myHashMap.add("Test", 1);
            myHashMap.add("Test", 2);
        });
    }

    @Test
    public void isRemoveWorking(){
        assertThrows(NullPointerException.class, ()->{
            MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
            myHashMap.add("test", 1);
            myHashMap.remove("test");
            myHashMap.getValue("test");
        });
    }

    @Test
    public void isClearAllWorking(){
        assertThrows(NullPointerException.class, ()->{
            MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
            myHashMap.add("test", 1);
            myHashMap.add("tes", 2);
            myHashMap.add("te", 3);
            myHashMap.add("t", 4);
            myHashMap.clearAll();
            myHashMap.getValue("t");
        });
    }
}