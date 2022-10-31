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
        //Arrange
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        //Act
        String actual = cat.getSound();
        //Assert
        Assert.assertEquals("Cat is not mewing!", expected, actual);
    }

    @Test
    public void getFoodSuccess() throws Exception {
        //Arrange
        Cat cat = new Cat(feline);
        List<String> expected = new LinkedList<>();
        //Act
        List<String> actual = cat.getFood();
        //Assert
        Assert.assertEquals("Object class is not expected!", expected.getClass(), actual.getClass());
    }

}