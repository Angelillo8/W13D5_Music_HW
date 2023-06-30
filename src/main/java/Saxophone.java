public class Saxophone extends Instrument {

    private int numberOfPassageways;

    public Saxophone(String manufacturer, String material, String colour, String type, double cost, double price, int numberOfPassageways) {
        super(manufacturer, material, colour, type, cost, price);
        this.numberOfPassageways = numberOfPassageways;
    }

    public int getNumberOfPassageways() {
        return numberOfPassageways;
    }

    @Override
    public String play() {
        return "Fuuupf!";
    }

    @Override
    public double calculateMarkup(double cost, double price) {
        return price - cost;
    }
}
