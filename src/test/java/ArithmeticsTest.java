
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTest {

    @Test
    void convertsOne() {
        assertEquals(1, new Arithmetics().solve(1));
    }

}
