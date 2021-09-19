package generics;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<String, Integer, Float> box1 = new Box<>("Box 1", 5, 4.9f);
        Box<String, Integer, Float> box2 = new Box<>("Box 2", 7, 8.1f);
        float result = box1.getValue() + box1.getFloats() + box2.getValue() + box2.getFloats();
        assertEquals(25.0, result, 0.0001);
    }
}