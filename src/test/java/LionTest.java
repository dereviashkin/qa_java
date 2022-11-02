import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeMaleSuccess() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expected = true;
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals("Lion does not have mane!", expected, actual);
    }

    @Test
    public void doesHaveManeFeMaleSuccess() throws Exception {
        Lion lioness = new Lion("Самка", feline);
        boolean expected = false;
        boolean actual = lioness.doesHaveMane();
        Assert.assertEquals("Lioness have mane!", expected, actual);
    }

    @Test
    public void getKittensSuccess() throws Exception {
        Lion lioness = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lioness.getKittens();
        Assert.assertEquals("Amount of kittens is incorrect!", expected, actual);
    }

    @Test
    public void getKittensFailure() throws Exception {
        Lion lioness = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(10);
        int expected = 1;
        int actual = lioness.getKittens();
        Assert.assertNotEquals("Amount of kittens is correct and it's wrong!", expected, actual);
    }

    @Test
    public void getFoodSuccess() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        Assert.assertEquals("List of food is incorrect!", expected, actual);
    }

    @Test
    public void getFoodFailure() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        Assert.assertNotEquals("List of food is correct and it's wrong!", expected, actual);
    }
}