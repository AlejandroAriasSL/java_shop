package dev.alejandro.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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


}
