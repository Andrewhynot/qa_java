
package testlion;


import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class GetFoodTest {
    private final String sex;
    ArrayList<String> predatorFoodList = new ArrayList<>(List.of("Животные", "Птицы", "Рыба"));


    public GetFoodTest(String sex){
        this.sex = sex;
    }

    @Mock
    Feline feline;


    @Parameterized.Parameters
    public static Object[][] lionVariants(){
        return new Object[][]{
                {"Самец"},
                {"Самка"}
        };
    }


    @Test
    public void lionFoodList() throws Exception {
        MockitoAnnotations.openMocks(this);
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(predatorFoodList);
        assertThat(lion.getFood(), is(predatorFoodList));
    }


}


