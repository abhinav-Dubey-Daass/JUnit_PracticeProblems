import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class subtractionTest {
@Test
    public void testSubtraction(){
    int expectedOutput=3;
    int actualOutPut=new TestAddClass().subtraction(5,4);
    assertEquals(expectedOutput,actualOutPut,"Change the Input Not Expected Result");
    System.out.println("Success");
}
}