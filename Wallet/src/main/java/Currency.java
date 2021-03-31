public class Currency {

    private double currencyValue;
    private String currencyType;

    public Currency(String currencyType, double currencyValue) {
        this.currencyType=currencyType;
        this.currencyValue=currencyValue;
    }

    public double getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(double v) {
        this.currencyValue = v;
    }
}