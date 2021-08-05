package collections;

import java.util.Arrays;
import java.util.Iterator;

public class CarArrayList implements CarList {

    Car[] array = new Car[10];
    int size = 0;

    @Override
    public Car get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public boolean add(Car car) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = car;
        size++;
        return true;
    }

    @Override
    public boolean add(Car car, int index) {
        increaseArray();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = car;
        size++;
        return true;
    }

    @Override
    public boolean removeAt(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - 1 - index);
        size--;
        return true;
    }

    @Override
    public boolean remove(Car car) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(car)) {
                return removeAt(i);
            }
        }
        return false;
    }

    public boolean contains(Car car) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(car)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Car[10];
        size = 0;
    }

    @Override
    public Iterator<Car> iterator() {
        return new Iterator<Car>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Car next() {
                return array[index++];
            }
        };
    }

    private void checkIndex(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
        }

    private void increaseArray() {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}


