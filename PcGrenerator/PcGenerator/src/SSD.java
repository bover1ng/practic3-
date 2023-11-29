class SSD implements Configurе {
    private String capacity;
    private double price;
    private String brand;


    public SSD(String capacity, String brand, double price) {
        this.capacity = capacity;
        this.price = price;
        this.brand = brand;

    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return capacity + " " + brand;
    }
}