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

    public static void depositCurrency(String currencyType, double currencyValue, Currency dollar, Currency rupees) {
        if(currencyType == "Dollar") {
            dollar.setCurrencyValue(dollar.getCurrencyValue() + currencyValue);
        }
        else
            rupees.setCurrencyValue(rupees.getCurrencyValue() + currencyValue);
    }

    public static void withdrawCurrency(String preferredCurrency, double withdrawAmount, Currency dollar, Currency rupees) {
        if (returnTotalBalance("Dollar", dollar, rupees) > withdrawAmount) {
            if (preferredCurrency == "Dollars") {
                if (dollar.getCurrencyValue() >= withdrawAmount)
                    dollar.setCurrencyValue(dollar.getCurrencyValue() - withdrawAmount);
                else {
                    withdrawAmount =withdrawAmount- dollar.getCurrencyValue();
                    dollar.setCurrencyValue(0);
                    double remAmount = returnTotalBalance("Dollar", dollar, rupees)-withdrawAmount;
                    rupees.setCurrencyValue(remAmount*74.85);
                }
            }
        }
        else {
                if (rupees.getCurrencyValue() >= withdrawAmount)
                    rupees.setCurrencyValue(rupees.getCurrencyValue() - withdrawAmount);
            }
        }
}
