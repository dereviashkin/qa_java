import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundSuccess() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals("Cat is not mewing!", expected, actual);
    }

    @Test
    public void getFoodSuccess() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = new LinkedList<>();
        List<String> actual = cat.getFood();
        Assert.assertEquals("Object class is not expected!", expected.getClass(), actual.getClass());
    }

}