package dev.alejandro.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

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

    @Test
    @DisplayName("Test removeComputerByBrand method removes computer from the shop")
    void test_removes_computers_of_the_shop_by_brand(){

        Shop shop = new Shop("Mercadona", "Juan Roig", "53423423T");
        ShopController controller = new ShopController(shop);

        Computer computer = new Computer("Acer", "12GB", "2.4GHz", "Linux", 2.50);
        Computer computer1 = new Computer("ASUS", "12GB", "2.4GHz", "Linux", 2.50);

        controller.addComputerToShop(computer);
        controller.addComputerToShop(computer1);

        assertThat(controller.showShopComputers(), hasItem(computer));

        controller.removeByBrand("Acer");

        assertThat(controller.showShopComputers(), not(hasItem(hasProperty("brand", is("Acer")))));
        

       

        
    }




}
