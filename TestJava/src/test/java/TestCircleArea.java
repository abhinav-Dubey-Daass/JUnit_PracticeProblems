import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class TestCircleArea {
    @Test
    @Tag("production")
    @DisplayName("Circle Test Area")
//    @RepeatedTest(value = 3,name ="{displayName}- Repetition {currentRepetition} of  {totalRepetitions}")
    public void testComputeCircleArea() {
        TestAddClass testCircleArea = new TestAddClass();
        boolean assumption=false;
//        Assumptions.assumeTrue(assumption,"Ignoring Test! Cant run this test");
        assertEquals(314.197654321555, testCircleArea.computerCircleArea(9), "Should return the right value");
        System.out.println("success");
    }

    @Test
    @Tag("production")
    public void test11(){
        assertTrue(true);
    }
    @Test
    @Tag("development")
    public void test12(){
        assertTrue(true);
    }

    @Test
    @Tag("development")
    public void test13(){
        assertTrue(true);
    }

}
