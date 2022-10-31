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
        //Arrange
        Lion lion = new Lion("Самец", feline);
        boolean expected = true;
        //Act
        boolean actual = lion.doesHaveMane();
        //Assert
        Assert.assertEquals("Lion does not have mane!", expected, actual);
    }

    @Test
    public void doesHaveManeFeMaleSuccess() throws Exception {
        //Arrange
        Lion lioness = new Lion("Самка", feline);
        boolean expected = false;
        //Act
        boolean actual = lioness.doesHaveMane();
        //Assert
        Assert.assertEquals("Lioness have mane!", expected, actual);
    }

    @Test
    public void getKittensSuccess() throws Exception {
        //Arrange
        Lion lioness = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        //Act
        int actual = lioness.getKittens();
        //Assert
        Assert.assertEquals("Amount of kittens is incorrect!", expected, actual);
    }

    @Test
    public void getKittensFailure() throws Exception {
        //Arrange
        Lion lioness = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(10);
        int expected = 1;
        //Act
        int actual = lioness.getKittens();
        //Assert
        Assert.assertNotEquals("Amount of kittens is correct and it's wrong!", expected, actual);
    }

    @Test
    public void getFoodSuccess() throws Exception {
        //Arrange
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        //Act
        List<String> actual = lion.getFood();
        //Assert
        Assert.assertEquals("List of food is incorrect!", expected, actual);
    }

    @Test
    public void getFoodFailure() throws Exception {
        //Arrange
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        //Act
        List<String> actual = lion.getFood();
        //Assert
        Assert.assertNotEquals("List of food is correct and it's wrong!", expected, actual);
    }
}