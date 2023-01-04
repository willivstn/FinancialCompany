public abstract class ShareAsset implements Asset {

    //This is redundant coding

    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAsset(String symbol, double totalCost) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }

    //adds a cost of the given amount of this asset
    public void addCost(double cost){
        totalCost += cost;
    }

    //returns the price per share of this asset
    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    //returns current market value of this asset
    public abstract double getMarketValue();

    //return the profit earned on shares of this asset
    public double getProfit(){
        // calls an abstract getMarketValue method
        return getMarketValue() -totalCost;
    }
}
