package collections;

public interface CarSet<T> extends CarCollection<T> {
    default boolean add(T car) {
        return false;
    }

    boolean remove(T car);

    default int size() {
        return 0;
    }

    void clear();
}
