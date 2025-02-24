package dev.alejandro.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ComputerTest {

    private Computer computer;

    @BeforeEach
    void setUp(){
        computer = new Computer("Acer", "12GB", "2.4GHz", "Linux", 2.50);
    }


    @Test
    @DisplayName("The getBrand method returns the brand of the computer")
    void test_returns_brand_of_computer(){


        assertThat(computer.getBrand(), is("Acer"));
    }

    @Test
    @DisplayName("The getRAM method returns the RAM of the computer")
    void test_returns_ram_of_computer(){


        assertThat(computer.getRAM(), is("12GB"));
        
    }

}
