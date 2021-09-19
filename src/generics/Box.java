package generics;

public class Box<K, V, F> {
    private K key;
    private V value;
    private F floats;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public F getFloats() {
        return floats;
    }

    public void setFloats(F floats) {
        this.floats = floats;
    }

    public Box(K key, V value, F floats) {
        this.key = key;
        this.value = value;
        this.floats = floats;
    }
}
