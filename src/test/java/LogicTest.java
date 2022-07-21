import main.java.Logic;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LogicTest {
    @Test
    public void logicTest(){
        Logic logic = new Logic();
        String s = logic.resLogic(false, false, "con");
        String s1 = logic.resLogic(true, false, "con");
        String s2 = logic.resLogic(true, true, "con");
        String s3 = logic.resLogic(true, true, "imp");
        String s4 = logic.resLogic(true, false, "imp");
        assertThat(s, equalTo("Неправда ваша!"));
        assertThat(s1, equalTo("Неправда ваша!"));
        assertThat(s2, equalTo("Истину глаголете!"));
        assertThat(s2, containsString("глаголете!"));
        assertThat(s3, anyOf(containsString("полуправда"), endsWith("истина?")));
        }

    }

