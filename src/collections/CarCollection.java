package collections;

public interface CarCollection<T> extends Iterable<T> {
    boolean add(T car);

    default boolean remove(T car) {
        return false;
    }

    int size();

    default void clear() {

    }

    boolean contains(T car);
}
