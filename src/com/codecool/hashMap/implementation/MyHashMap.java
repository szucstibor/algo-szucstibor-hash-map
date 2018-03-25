package com.codecool.hashMap.implementation;


import java.util.LinkedList;

class KeyValue<K, V> {
    public K key;
    public V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class MyHashMap<K, V> {

    private int bucketSize = 16;

    private LinkedList<KeyValue>[] elements = new LinkedList[bucketSize];

    public MyHashMap() {
        for (int i = 0; i < bucketSize; i++) {
            elements[i] = new LinkedList<KeyValue>();
        }
    }

    public void add(String key, Integer value) {
        Integer valueCode = value.hashCode() % bucketSize;
        LinkedList list = elements[valueCode];
        if(findKey(key) != null){
            throw new IllegalArgumentException("Key already exists");
        }
        KeyValue<String, Integer> kv = new KeyValue<>(key, value);
        list.add(kv);
    }

    public int getValue(String key){
        return (int) findKey(key).value;
    }

    private KeyValue findKey(String key) {
        for (int i = 0; i <bucketSize; i++) {
            for (int j = 0; j < elements[i].size() ; j++) {
                if (elements[i].get(j).key.equals(key)) {
                    return elements[i].get(j);
                }
            }
        }
        return null;
    }

    public void remove(String key){
        for (int i = 0; i < bucketSize ; i++) {
            for (int j = 0; j < elements[i].size() ; j++) {
                if (elements[i].get(j).key.equals(key)){
                    elements[i].get(j).key = null;
                    elements[i].get(j).value = null;
                }
            }
        }
    }

    public void clearAll(){
        for (int i = 0; i < bucketSize ; i++) {
            for (int j = 0; j < elements[i].size() ; j++) {
                    elements[i].get(j).key = null;
                    elements[i].get(j).value = null;
            }
        }
    }

}
