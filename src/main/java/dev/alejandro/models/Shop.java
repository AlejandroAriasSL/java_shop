package dev.alejandro.models;

import java.util.ArrayList;
import java.util.List;
import dev.alejandro.models.Computer;

public class Shop {

    private String shopName;
    private String shopOwner;
    private String shopID;
    private List<Computer> computers;
    
    public Shop(String shopName, String shopOwner, String shopID) {
        this.shopName = shopName;
        this.shopOwner = shopOwner;
        this.shopID = shopID;
        this.computers = new ArrayList<>();
    }

    public String getShopName(){
        return this.shopName;
    }

    public String getShopOwner(){
        return this.shopOwner;
    }

    public String getShopID(){
        return this.shopID;
    }

    public List<Computer> getComputers(){
        return this.computers;
    }

    public void addComputer(Computer computer){
        this.computers.add(computer);
    }

    public void removeComputerByBrand(String brand){
        computers.
        removeIf(computer -> brand.equals(computer.getBrand()));
    }

}
