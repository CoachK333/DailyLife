package com.example.source_code_view.mycode;

import lombok.AllArgsConstructor;
import lombok.Data;

public class MyHashMap<K, V> {

    private Entry<K, V>[] table;
    private static final Integer CAPACITY = 8;

    public void put(K k, V v) {
        Entry entry = new Entry(k, v);

        if (table == null) {
            inflate();
        }
        //存entry

    }

    private void inflate() {
        table = new Entry[CAPACITY];
    }

    public V get(K k) {
        return null;
    }

    @Data
    @AllArgsConstructor
    class Entry<K, V> {
        private K key;
        private V value;
    }
}
