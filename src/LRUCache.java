import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Node {
    int key;
    char value;
    Node next;
    Node prev;

    Node(int pKey, char pVal) {
        this.key = pKey;
        this.value = pVal;
    }
}

public class LRUCache {

    List<Integer> cacheList = new LinkedList<>();
    Map<Integer, Node> cacheMap = new HashMap<Integer, Node>();

    final static int CACHE_SIZE = 5;

    Node head =null;
    Node tail =null;


    private void addElementToCache(int key, char value) {
        System.out.println("Adding element to Cache");
        Node n = new Node(0, value);
        cacheMap.put(key, n);
        n.next = null;



    }

    private void getElement(int key) {
        System.out.println("Element fetched from cache:" + cacheList.get(key));
    }

    public void displayCache() {
        System.out.println("Current cache Elements:");
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache();

    }

    public void removeElement(int key) {

    }
}
