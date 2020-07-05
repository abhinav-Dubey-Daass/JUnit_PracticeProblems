import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDivideTest {
    @Test
    public void testDivide() {
        final TestAddClass divide = new TestAddClass();
        assertThrows(Exception.class, () -> divide.divide(1, 0), "Divide by Zero should Throw");
//    assertEquals(0,divide.divide(1,0),"do it again");
        boolean thrown = true;
        try {
            divide.divide(1, 0);
        } catch (ArithmeticException e) {
            thrown = false;
        }
        assertTrue(thrown, "TestCase Failed");
//        assertEquals("ABCD".equalsIgnoreCase("a1bcd"), true);
//        assertFalse("ABCD".equalsIgnoreCase("a1bcd"));//
//        assertTrue("ABCD".equalsIgnoreCase("a1bcd"), "test is failed");
//        assertTrue(false);
    }
}