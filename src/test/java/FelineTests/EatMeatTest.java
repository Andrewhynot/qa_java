package FelineTests;

import com.example.Feline;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EatMeatTest {


    ArrayList<String> predatorFoodList = new ArrayList<>(List.of("Животные", "Птицы", "Рыба"));



    @Test
    public void felineFoodList() throws Exception {
        Feline feline = new Feline();
        assertThat(feline.eatMeat(), is(predatorFoodList));


    }


}
