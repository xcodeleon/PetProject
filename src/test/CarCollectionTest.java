package test;

import collections.Car;
import collections.CarCollection;
import collections.CarLinkedList;
import org.junit.*;
import org.junit.Test;


import static org.junit.Assert.*;

public class CarCollectionTest {

    private CarCollection<Car> carCollection;

    @Before
    public void setUp() throws Exception {
        carCollection = new CarLinkedList<>();
        for (int i = 0; i < 100; i++) {
            carCollection.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void contains() {
        assertTrue(carCollection.contains(new Car("Brand20", 20)));
        assertFalse(carCollection.contains(new Car("Brand200", 200)));
    }

    @Test
    public void testForeach() {
        int index = 0;
        for (Car car : carCollection) {
            index++;
        }
        assertEquals(100, index);
    }
}