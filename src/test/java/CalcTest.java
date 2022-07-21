import main.java.Main;
import org.junit.jupiter.api.Test;

import static java.lang.Math.random;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalcTest {
    @Test
    public void sumTest() {
        final double testA1 = - 500_000_000_000_000.0;
        final double testA2 = - 500_000_000_000_000.0;
        final double testA3 = - random()*Double.MAX_VALUE;
        final double testA4 = - random()*Double.MIN_VALUE;
        double res = Main.calc("+", testA1, testA2);
        double res1 = Main.calc("+", testA3, testA4);
        assertThat(res, equalTo(- 1_000_000_000_000_000.0));
        assertThat(res1, lessThan(0.0));
    }
    @Test
    public void sqrtTest() {
        final double testA1 = 16.0;
        final double testA2 = 0.0;
        final double testA3 = -1.0;
        double res = Main.calc("sqrt", testA1);
        double res1 = Main.calc("sqrt", testA2);
        double res2 = Main.calc("sqrt", testA3);

        assertThat(res, closeTo(4.0, 0.0000001));
        assertThat(res1, closeTo(0.0, 0.0000001));
        assertThat(res2, equalTo(Double.NaN));


    }
    @Test
    public void divTest() {
        final double testA1 = 16;
        final double testA2 = 0;
        double res = Main.calc("/", testA1, testA2);
        assertThat(res, equalTo(Double.NaN));
    }
    @Test
    public void multiTest() {
        final double testA1 = Double.MAX_VALUE;
        final double testA2 = Double.MAX_VALUE;
        final double testA3 = Double.MIN_VALUE;
        double res = Main.calc("*", testA1, testA2);
        double res1 = Main.calc("*", testA1, testA3);
        assertThat(res, equalTo(0.0));
        assertThat(res1, equalTo(1.7976931348623157E308));

    }
}
