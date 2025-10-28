package CommonlySolvedProblems;

import java.util.LinkedList;
import java.util.Objects;

public class CustomHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;


    static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Entry<K, V>>[] buckets;  //array of linkedlist
    private int hashMapSize;
    private int capacity;
    private double loadFactor;

    public CustomHashMap() {
        this(DEFAULT_CAPACITY, LOAD_FACTOR);
    }

    public CustomHashMap(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.hashMapSize = 0;
        this.buckets = new LinkedList[capacity];
    }

    private int getHashCode(K key) {
        return Objects.hashCode(key) % capacity;
    }

    public void put(K key, V value) {
        int bucketIndex = getHashCode(key);
        if (this.buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new LinkedList<>(); //adding new linkedList in the bucket if null
        }
        //else get the linkedlist which already has values
        LinkedList<Entry<K, V>> currentBucketList = buckets[bucketIndex];

        for (Entry<K, V> entry : currentBucketList) {
            if (entry.key.equals(key)) {
                entry.value = value;
            }
        }
        currentBucketList.add(new Entry<>(key, value));
        hashMapSize++;

        if ((double) hashMapSize / capacity > loadFactor) {
            resizeHashmap();
        }

    }

    public V get(K key) {
        int bucketIndex = getHashCode(key);
        if (buckets[bucketIndex] != null) {
            for (Entry<K, V> entry : buckets[bucketIndex]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void resizeHashmap() {
        this.capacity = capacity*2;

        LinkedList<Entry<K,V>> newBucket[] = new LinkedList[capacity];


    }


}
