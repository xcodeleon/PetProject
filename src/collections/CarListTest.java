package collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarListTest {

    private CarList carList;

    @Before
    public void setUp() throws Exception {
        carList = new CarLinkedList();
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("Brand" + i, i));
        }
    }

    //тест на успешное добавление Car
    @Test
    public void whenAdded100ElementsThenMustBe100() {
        assertEquals(100, carList.size());
    }

    //тест на удаление по индексу
    @Test
    public void whenElementsRemovedByIndexThenSizeMustBeDecreased() {
        assertTrue(carList.removeAt(5));
        assertEquals(99, carList.size());
    }

    //Тест на проверку уменьшения листа после удаление car
    @Test
    public void whenElementsRemovedThenSizeMustBeDecreased() {
        Car car = new Car("Toyota", 15);
        carList.add(car);
        assertEquals(101, carList.size());
        assertFalse(carList.remove(car));
        assertEquals(100, carList.size());
    }

    //удаление не существующего элемента
    @Test
    public void whenNonExistentElementRemovedThenReturnFalse() {
        Car car = new Car("Toyota", 15);
        assertFalse(carList.remove(car));
        assertEquals(100, carList.size());
    }

    @Test
    public void size() {
    }


    //проверка на очистку
    @Test
    public void whenListClearedThenSizeMustBe0() {
        carList.clear();
        assertEquals(0, carList.size());
    }

    //выход за пределы массива
    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutOfBoundsThenThrownException() {
        carList.get(100);

    }

    //проверка метода get на получение верного значения
    @Test
    public void methodGetReturnRightValue() {
        Car car = carList.get(0);
        assertEquals("Brand0", car.getBrand());
    }

    @Test
    public void addInMiddlePosition() {
        Car car = new Car("Volvo", 1);
        carList.add(car, 50);
        Car carFromList = carList.get(50);
        assertEquals("Volvo", carFromList.getBrand());
    }

    @Test
    public void addIntoFirstPosition() {
        Car car = new Car("Volvo", 1);
        carList.add(car, 0);
        Car carFromList = carList.get(0);
        assertEquals("Volvo", carFromList.getBrand());
    }

    @Test
    public void addIntoLastPosition() {
        Car car = new Car("Volvo", 1);
        carList.add(car, 100);
        Car carFromList = carList.get(100);
        assertEquals("Volvo", carFromList.getBrand());
    }
}