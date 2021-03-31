import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    public void test1DollarIsEqualTo74_85Rupees() {
        boolean actualValue;
        boolean expectedValue = true;
        String currencyType1 = "Dollar";
        String currencyType2 = "Rupees";
        double currencyValue1 = 1;
        double currencyValue2 = 74.85;
        Currency dollar = new Currency(currencyType1,currencyValue1);
        Currency rupees = new Currency(currencyType2,currencyValue2);

        actualValue = WalletFunctionality.compareDollarWithRupees(dollar,rupees);

        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void test1XDollarIsEqualTo74_85XRupees() {
        boolean actualValue;
        boolean expectedValue  = true;
        String currencyType1 = "Dollar";
        String currencyType2 = "Rupees";
        double currencyValue1 = 3;
        double currencyValue2 = 74.85*3;
        Currency dollar = new Currency(currencyType1,currencyValue1);
        Currency rupees = new Currency(currencyType2,currencyValue2);

        actualValue = WalletFunctionality.compareDollarWithRupees(dollar,rupees);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testForReturningTotalBalanceWhenPreferredCurrencyIsRupees() {
        double actualValue;
        double expectedValue = 299.40;
        String preferredCurrency = "Rupees";
        String currencyType1 = "Dollar";
        String currencyType2 = "Rupees";
        double currencyValue1 = 3;
        double currencyValue2 = 74.85;
        Currency dollar = new Currency(currencyType1,currencyValue1);
        Currency rupees = new Currency(currencyType2,currencyValue2);

        actualValue = WalletFunctionality.returnTotalBalance(preferredCurrency, dollar, rupees);

        assertEquals(expectedValue, actualValue, 0.00001);
    }
}
