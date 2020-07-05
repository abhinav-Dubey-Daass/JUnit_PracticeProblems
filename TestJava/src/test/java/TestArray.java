import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestArray {
    @Test
    public void testArray() {
        int[] expectedArray = {12, 2, 3, 53, 33};
        int[] actualArray = {12, 2, 3, 53, 33,555};
        assertArrayEquals(expectedArray,actualArray,"Both the array are not equal");
        System.out.println("Success");
    }
}
