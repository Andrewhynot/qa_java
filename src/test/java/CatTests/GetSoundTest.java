package CatTests;

import com.example.Feline;
import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


@RunWith(MockitoJUnitRunner.class)
public class GetSoundTest {

    private final String catSound = "Мяу";

    @Mock
    Feline feline;



    @Test
    public void catGivesASound() {
        Cat cat = new Cat(feline);
        assertThat(cat.getSound(), is(catSound));
    }



}
