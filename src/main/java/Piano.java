public class Piano extends Instrument {

    private int numberOfTiles;

    public Piano(String manufacturer, String material, String colour, String type, double cost, double price, int numberOfTiles) {
        super(manufacturer, material, colour, type, cost, price);
        this.numberOfTiles = numberOfTiles;
    }

    public int getNumberOfTiles() {
        return numberOfTiles;
    }

    @Override
    public String play() {
        return "Plin-Plin!";
    }

    @Override
    public double calculateMarkup(double cost, double price) {
        return price - cost;
    }
}
