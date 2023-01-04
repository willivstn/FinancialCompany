public class MutualFunds extends ShareAsset implements Asset{

    private double totalShares;

    public MutualFunds(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0.0;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    public double getTotatlShares() {
        return totalShares;
    }

    @Override
    public double getProfit() {
        return getMarketValue() - getTotalCost();
    }

    //records purchase of the given shares at the given price
    public void purchase(double shares, double pricePerShare){
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
