import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTest {

    private Arithmetics arithmetics;
    @BeforeEach
    public void setUp() {
        arithmetics = new Arithmetics();
    }

    @Test
    void convertsOne() {
        assertEquals(1, arithmetics.solve(1));
    }

    @Test
    void convertsTwo() {
        assertEquals(2, arithmetics.solve(2));
    }

    @Test
    void convertsThree() {
        assertEquals(3, arithmetics.solve(3));
    }

}
