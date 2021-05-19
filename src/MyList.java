import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    public void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    public void add(int index, E e) {
        if (size == element.length) {
            ensureCapa();
        }
        for (int i = size - 1; i > index; i--) {
            element[i + 1] = element[i];
        }
        element[index] = e;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " ngoài giới hạn mảng");
        }
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return (E) element;
    }

    public int size() {
        return size;
    }

    public E clone() {
        Object[] element1 = Arrays.copyOf(element, size);
        return (E) element1;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (element[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (element[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean add1(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize;
        if (element.length < minCapacity) {
            newSize = minCapacity;
            element = Arrays.copyOf(element, newSize);
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) element[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            element[i] = null;
        }
        size = 0;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(element[i]);
        }
    }
}
