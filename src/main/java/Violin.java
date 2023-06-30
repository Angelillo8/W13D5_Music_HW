public class Violin extends Instrument {

    private int numberOfStrings;

    public Violin(String manufacturer, String material, String colour, String type, double cost, double price, int numberOfStrings) {
        super(manufacturer, material, colour, type, cost, price);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "Miiiiing";
    }

    @Override
    public double calculateMarkup(double cost, double price) {
        return price - cost;
    }
}
