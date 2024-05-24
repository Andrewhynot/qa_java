
package CatTests;

import com.example.Animal;
import com.example.Feline;
import com.example.Cat;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GetFoodTest {

    ArrayList<String> predatorFoodList = new ArrayList<>(List.of("Животные", "Птицы", "Рыба"));


    @Mock
    Feline feline;



    @Test
    public void catFoodList() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(predatorFoodList);
        assertThat(cat.getFood(), is(predatorFoodList));
    }

}


