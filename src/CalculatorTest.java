import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  Calculator myCalculator = new Calculator();

  @Test
  public void testGetArea() {
    assertEquals(myCalculator.addition(23,45), 68);
  }
}
