package testfeline;

import com.example.Feline;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EatMeatAndGetFamilyAndGetKittenTest {

    private final String felineFamily = "Кошачьи";
    ArrayList<String> predatorFoodList = new ArrayList<>(List.of("Животные", "Птицы", "Рыба"));
    private final int felineKittensCount = 1;


    @Test
    public void felineFoodList() throws Exception {
        Feline feline = new Feline();
        assertThat(feline.eatMeat(), is(predatorFoodList));

    }

    @Test
    public void felineGivesFamily() {
        Feline feline = new Feline();
        assertThat(feline.getFamily(), is(felineFamily));


    }

    @Test
    public void felineDefaultKittenCount(){
        Feline feline = new Feline();
        assertThat(feline.getKittens(), is(felineKittensCount));
    }


}
