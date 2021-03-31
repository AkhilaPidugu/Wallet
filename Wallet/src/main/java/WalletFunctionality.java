public class WalletFunctionality {

    public static boolean compareDollarWithRupees(Currency dollar, Currency rupees) {
        if (dollar.getCurrencyValue() * 74.85 == rupees.getCurrencyValue()) {
            return true;
        }
        return false;
    }
}
