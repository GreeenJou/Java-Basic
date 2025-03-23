package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RectangleTest {

    @Test
    void testCalculatePerimeter() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(25, rect.calculatePerimeter(), "Периметр должен быть 25");
    }

    @Test
    void testCalculateArea() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(45, rect.calculateArea(), "Площадь должна быть 45");
    }
}