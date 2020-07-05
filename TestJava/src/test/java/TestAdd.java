

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAdd {


    @Test
    public void testAdd() {
        TestAddClass testAddClass = new TestAddClass();
        int expectedSumOutput = 2;
        int actualSumOutput = testAddClass.add(1, 1);
        assertEquals(expectedSumOutput, actualSumOutput);
        System.out.println("Success");
    }
}