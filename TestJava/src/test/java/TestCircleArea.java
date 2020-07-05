import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCircleArea {
@Test
    public void testComputeCircleArea(){
    TestAddClass testCircleArea=new TestAddClass();
    assertEquals(314.197654321555,testCircleArea.computerCircleArea(10),"Should return the right value");

}

}