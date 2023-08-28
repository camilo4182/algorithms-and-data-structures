package com.camilo.datastructures.hashtables;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class HashTableBucket<K, V> {

    private K key;
    private V value;

    public HashTableBucket(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
