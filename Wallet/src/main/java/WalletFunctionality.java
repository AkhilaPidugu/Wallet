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
        if (preferredCurrency == "Dollars") {
            if (returnTotalBalance("Dollar", dollar, rupees) > withdrawAmount) {
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
        else if(preferredCurrency == "Rupees") {
            if (returnTotalBalance("Rupees", dollar, rupees) > withdrawAmount) {
                if (rupees.getCurrencyValue() >= withdrawAmount)
                    rupees.setCurrencyValue(rupees.getCurrencyValue() - withdrawAmount);
                else {
                    withdrawAmount =withdrawAmount- rupees.getCurrencyValue();
                    rupees.setCurrencyValue(0);
                    double remAmount = returnTotalBalance("Rupees", dollar, rupees)-withdrawAmount;
                    dollar.setCurrencyValue(remAmount/74.85);
                }
            }
        }
    }
}
