package com.example.tddtest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyMathUtilsTest {

    @Test
    void testAddition() {
        MyMathUtils mathUtils = new MyMathUtils();
        int result = mathUtils.add(5, 3);
        assertEquals(8, result, "덧셈 결과는 반드시 8");
    }

    @Test
    void testSubtraction() {
        MyMathUtils mathUtils = new MyMathUtils();
        int result = mathUtils.subtract(10, 5);
        assertEquals(5, result, "뺄셈 결과는 반드시 5");
    }
}
