package dev.alejandro.controllers;

import java.util.List;

import dev.alejandro.models.Computer;
import dev.alejandro.models.Shop;

public class ShopController {

    private Shop shop;

    public ShopController(Shop shop) {
        this.shop = shop;
    }

    public void addComputerToShop(Computer computer){
        shop.addComputer(computer);
    }

    public List<Computer> showShopComputers(){
        return shop.getComputers();
    }


}
