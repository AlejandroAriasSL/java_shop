package dev.alejandro.models;

public class Computer {

    private final String brand;
    private final String ram;
    private final String cpu;
    private final String os;
    private final double price;
    
    public Computer(String brand, String ram, String cpu, String os, double price) {
        this.brand = brand;
        this.ram = ram;
        this.cpu = cpu;
        this.os = os;
        this.price = price;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getRAM(){
        return this.ram;
    }

    public String getCPU(){
        return this.cpu;
    }

    public String getOS(){
        return this.os;
    }
    
    public double getPrice(){
        return this.price;
    }
    

}
