public class MusicSheet implements ISell{

    private String type;
    private double cost;
    private double price;

    public MusicSheet(String type, double cost, double price) {
        this.type = type;
        this.cost = cost;
        this.price = price;
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

    @Override
    public double calculateMarkup(double cost, double price) {
        return price - cost;
    }
}
