import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EligibilityVotingTest {
    EligibilityVoting object;

    @BeforeAll
    static void beforeAll(){
        System.out.println("It is going to be execute before all methods");
    }
    @AfterEach
    void cleanUp(){
        System.out.println("cleaning code after each method!");
    }
    @BeforeEach
    void init(){
        object=new EligibilityVoting();
    }
    @Test
    void isEligible() {
        assertTrue(object.isEligible(19),"Age should be greater than 18");
    }

    @Test
    void isPresidentElection() {
        List<Integer> first= Arrays.asList(1,2,3,4);
        List<Integer> second= Arrays.asList(1,2,3,4);
        assertIterableEquals(first,second,"list are not equal");
        assertNotEquals(false,object.isChiefMinisterElection(34),"chief minister age should be greater than 30");
    }

    @Test
    void isChiefMinisterElection() {
        EligibilityVoting object1=object;
        assertSame(object1,object,"object are not same");
    }
}