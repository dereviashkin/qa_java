import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final boolean expected;
    private final String sex;

    public LionParameterizedTest(String sex, boolean expected) {
        this.expected = expected;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getParametersData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeParamsSuccess() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals("Expected result differs from actual", expected, actual);
    }
}
