import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5, result, "2 + 3 = 5");
    }
}
