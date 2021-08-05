package collections;

public interface CarSet extends CarCollection {
    default boolean add(Car car) {
        return false;
    }

    boolean remove(Car car);

    default int size() {
        return 0;
    }

    void clear();
}
