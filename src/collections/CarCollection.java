package collections;

public interface CarCollection extends Iterable<Car> {
    boolean add(Car car);

    default boolean remove(Car car) {
        return false;
    }

    int size();

    default void clear() {

    }

    boolean contains(Car car);
}
