public class CodeTest {

    // Goal is to gather a person's financial investments using Stocks, Dividend Stocks, Mutual funds and cash
    public static void main(String[] args) {

        //1 Classes: Stocks, DividendStocks, MutualFunds, Cash
        //2 Relations: DividendStocks is-a Stock
        //3 Because different assets compute their market values in different ways
        //We use Interface: getMarket Value and getProfit
        //4 Similarities between mutual funds and stocks
        //  both store assets that are based on shares

        Asset asset = new MutualFunds("AMZ", 300);

    }
}