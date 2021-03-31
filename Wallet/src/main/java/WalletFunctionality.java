public class WalletFunctionality {

    public static boolean compareDollarWithRupees(Currency dollar, Currency rupees) {
        if (dollar.getCurrencyValue() * 74.85 == rupees.getCurrencyValue()) {
            return true;
        }
        return false;
    }

    public static double returnTotalBalance(String preferredCurrency, Currency dollar, Currency rupees) {
        if(preferredCurrency == "Rupees") {
            return dollar.getCurrencyValue() * 74.85 + rupees.getCurrencyValue();
        }
        else
            return dollar.getCurrencyValue() + rupees.getCurrencyValue()/74.85;
    }
}
