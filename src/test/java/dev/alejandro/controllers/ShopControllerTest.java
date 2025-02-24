package dev.alejandro.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.alejandro.models.Computer;
import dev.alejandro.models.Shop;

public class ShopControllerTest {

    private ShopController controller;
    private Shop shop;
    private Computer computer;

    @BeforeEach
    void setUp(){
        shop = new Shop("Mercadona", "Juan Roig", "53423423T");
        controller = new ShopController(shop);
        computer = new Computer("Acer", "12GB", "2.4GHz", "Linux", 2.50);
        controller.addComputerToShop(computer);
    }

    @Test
    @DisplayName("Test addComputerToShop method adds computer to the shop and showShopComputers returns the computers")
    void test_add_computers_to_the_shop_and_show_them(){

        Computer computer1 = new Computer("Acer", "12GB", "2.4GHz", "Linux", 2.50);

        controller.addComputerToShop(computer1);

        assertThat(controller.showShopComputers(), hasItem(computer1));
    }

    @Test
    @DisplayName("Test removeComputerByBrand method removes computer from the shop")
    void test_removes_computers_of_the_shop_by_brand(){

        Computer computer1 = new Computer("ASUS", "12GB", "2.4GHz", "Linux", 2.50);

        controller.addComputerToShop(computer1);

        assertThat(controller.showShopComputers(), hasItem(computer));

        controller.removeByBrand("Acer");

        assertThat(controller.showShopComputers(), not(hasItem(hasProperty("brand", is("Acer")))));
        
    }

    @Test
    @DisplayName("Test filterComputersByBrand method filters computer by brand")
    void test_filters_computers_by_brand(){

        assertEquals(controller.filterComputersByBrand("Acer"), computer);
    }




}
