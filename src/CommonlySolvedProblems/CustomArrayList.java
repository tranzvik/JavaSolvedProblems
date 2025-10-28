package CommonlySolvedProblems;

import java.util.Arrays;

public class CustomArrayList<T> {

    Object[] element;
    int currentSize;
    static int DEFAULT_CAPACITY = 10;

    CustomArrayList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    CustomArrayList(int givenSize) {
        element = new Object[givenSize];
        this.currentSize = 0;
    }

    public boolean add(T elem) {
        ensureCapacity(currentSize);
        element[currentSize++] = elem;
        return true;
    }

    public boolean add(int index, T elem) {
        if (index < 0 || index > currentSize) {
            throw new IndexOutOfBoundsException("index:" + index + "actual Size: " + currentSize);
        }
        ensureCapacity(currentSize + 1);
        System.arraycopy(element, index, element, index + 1, currentSize - index);

        return true;
    }

    public T get(int index) {
        if (index < 0 || index > currentSize) {
            throw new IndexOutOfBoundsException("index" + index + "actual size: " + currentSize);
        } else {
            return (T) element[index];
        }
    }

    public T remove(int index) {
        if (index < 0 || index > currentSize) {
            throw new IndexOutOfBoundsException("index" + index + "actual size: " + currentSize);
        }
        T removedElem = (T) element[index];
        System.arraycopy(element, index + 1, element, index, currentSize - index - 1);
        return removedElem;

    }


    public void ensureCapacity(int size) {
        if (size > currentSize) {
            element = Arrays.copyOf(element, currentSize + currentSize / 2);
        }
    }
}
