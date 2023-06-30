public abstract class Instrument implements IPlay, ISell {

    private String manufacturer;
    private String material;
    private String colour;
    private String type;
    private double cost;
    private double price;

    public Instrument(String manufacturer, String material, String colour, String type, double cost, double price) {
        this.manufacturer = manufacturer;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.cost = cost;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public double getPrice() {
        return price;
    }


}
