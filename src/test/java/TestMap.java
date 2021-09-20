import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestMap {
  class Tripler implements UnaryFunction {
    public double exec(double argument) {
      return argument * 3;
    }
  }

  @Test
  public void testMap1() {
    // Test #1
		double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
		double[] results = Lab02.map(new Doubler(), values);

    assertEquals(results.length, 5);
    assertEquals(results[0], 2.0);
    assertEquals(results[1], 4.0);
    assertEquals(results[2], 6.0);
    assertEquals(results[3], 8.0);
    assertEquals(results[4], 10.0);
  }

  @Test
  public void testMap2() {
    // Test #2
		double[] values = {3.0, 2.0, 1.0};
		double[] results = Lab02.map(new Tripler(), values);

    assertEquals(results.length, 3);
    assertEquals(results[0], 9.0);
    assertEquals(results[1], 6.0);
    assertEquals(results[2], 3.0);
  }
}
