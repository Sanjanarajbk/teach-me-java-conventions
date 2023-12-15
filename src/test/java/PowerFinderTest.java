
import org.junit.jupiter.api.Test;
import powerpackage.PowerFinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerFinderTest {


    @Test
    void ReturnOneWhenOneRaisedToThePowerOne() {

        assertEquals(1, PowerFinder.Of(1,1));
    }

    @Test
    void  ReturnTwoWhenTwoRaisedToThePowerOne () {
        assertEquals(2,PowerFinder.Of(2,1));
    }

    @Test
    void ReturnFourWhenTwoRaisedToThePowerTwo() {
        assertEquals(4,PowerFinder.Of(2,2));
    }

    @Test
    void ReturnNineWhenThreeRaisedToThePowerTwo() {
        assertEquals(9,PowerFinder.Of(3,2));
    }

}
