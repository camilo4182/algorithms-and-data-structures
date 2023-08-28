package com.camilo.datastructures.hashtables;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OwnHashTable<K, V> {

    private final int DEFAULT_SIZE = 5;

    private HashTableBucket[] table;

    public OwnHashTable() {
        this.table = new HashTableBucket[DEFAULT_SIZE];
    }

    public OwnHashTable(int size) {
        this.table = new HashTableBucket[size];
    }

    public V put(K key, V value) {
        int hashedKey = hash(key);
        table[hashedKey] = HashTableBucket.builder().key(key).value(value).build();
        return value;
    }

    private int hash(K key) {
        return (int) key.hashCode() % table.length;
    }

    public V get(K key) {
        int hashedKey = hash(key);
        return (V) table[hashedKey].getValue();
    }

    public List<K> getKeys() {
        List<K> keys = new ArrayList<>();
        for (int i = 0; i < table.length; i++) {
            if (!Objects.isNull(table[i])) {
                keys.add((K) table[i].getKey());
            }
        }
        return keys;
    }

}
