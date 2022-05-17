import com.epam.module1.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void positiveNumber() {
        String str1 = "15";
        boolean expression = StringUtils.isPositiveNumber(str1);
        assertTrue(expression);
    }
}