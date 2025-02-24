package dev.alejandro.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.alejandro.models.Computer;
import dev.alejandro.models.Shop;

public class ShopControllerTest {

    @Test
    @DisplayName("Test addComputerToShop method adds computer to the shop and showShopComputers returns the computers")
    void test_add_computers_to_the_shop_and_show_them(){

        Computer computer = new Computer("Acer", "12GB", "2.4GHz", "Linux", 2.50);
        Shop shop = new Shop("Mercadona", "Juan Roig", "53423423T");
        ShopController controller = new ShopController(shop);

        controller.addComputerToShop(computer);

        assertThat(controller.showShopComputers(), hasItem(computer));
    }

}
