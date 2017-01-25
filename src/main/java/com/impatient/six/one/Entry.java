package com.impatient.six.one;

/**
 * Created by bobby on 1/24/2017.
 */
public class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}
