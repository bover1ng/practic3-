class PowerSupply implements Configurе {
    private String wattage;
    private String brand;
    private double price;

    public PowerSupply(String wattage, String brand, double price) {
        this.wattage = wattage;
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return wattage + " " + brand;
    }
}