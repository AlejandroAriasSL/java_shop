package dev.alejandro.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShopTest {

    private Shop shop;

    @BeforeEach
    void setUp(){
        shop = new Shop("Mercadona", "Juan Roig", "53423423T");
    }


    @Test
    @DisplayName("The getShopName method returns the name of the shop")
    void test_returns_name_of_shop(){


        assertThat(shop.getShopName(), is("Mercadona"));
    }

    @Test
    @DisplayName("The getShopOwner method returns the name of the owner")
    void test_returns_name_of_shop_owner(){

        assertThat(shop.getShopOwner(), is("Juan Roig"));
    }

    @Test
    @DisplayName("The getShopID method returns the identification number of the shop")
    void test_returns_identification_number_of_shop(){

        assertThat(shop.getShopID(), is("53423423T"));
    }

    @Test
    @DisplayName("The addComputer method adds a computer to the shop")
    void test_returns_list_of_computers_with_added_computer(){

        shop.addComputer(new Computer("Acer", "12GB", "2.4GHz", "Linux", 2.50));

        assertThat(shop.getComputers().size(), is(1));
    }

    @Test
    @DisplayName("The removeComputerByBrand method removes a computer from the shop")
    void test_returns_list_of_computers_with_removed_computer(){

        shop.addComputer(new Computer("Acer", "12GB", "2.4GHz", "Linux", 2.50));
        shop.addComputer(new Computer("ASUS", "12GB", "2.4GHz", "Linux", 2.50));

        assertThat(shop.getComputers(), hasItem(hasProperty("brand", is("ASUS"))));

        shop.removeComputerByBrand("ASUS");

        assertThat(shop.getComputers(), not(hasItem(hasProperty("brand", is("ASUS")))));
    }

    @Test
    @DisplayName("The getComputerByBrand method finds a computer in the shop by its brand")
    void test_returns_computer_by_its_brand(){

        Computer computer1 = new Computer("ASUS", "12GB", "2.4GHz", "Linux", 2.50);
        Computer computer2 = new Computer("Acer", "12GB", "2.4GHz", "Linux", 2.50);

        shop.addComputer(computer1);
        shop.addComputer(computer2);


        assertEquals(shop.getComputerByBrand("ASUS"), computer1);
    }




}
