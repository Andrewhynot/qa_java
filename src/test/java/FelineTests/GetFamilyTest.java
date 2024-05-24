package FelineTests;

import com.example.Feline;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class GetFamilyTest {

    private final String felineFamily = "Кошачьи";



    @Test
    public void felineGivesFamily() {
        Feline feline = new Feline();
        assertThat(feline.getFamily(), is(felineFamily));


    }



}
