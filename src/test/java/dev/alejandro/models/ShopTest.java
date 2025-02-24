package dev.alejandro.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShopTest {

    @Test
    @DisplayName("The getShopName method returns the name of the shop")
    void test_returns_name_of_shop(){

        Shop shop = new Shop("Mercadona", "Juan Roig", "53423423T");

        assertThat(shop.getShopName(), is("Mercadona"));
    }

    @Test
    @DisplayName("The getShopOwner method returns the name of the owner")
    void test_returns_name_of_shop_owner(){

        Shop shop = new Shop("Mercadona", "Juan Roig", "53423423T");

        assertThat(shop.getShopOwner(), is("Juan Roig"));
    }


}
