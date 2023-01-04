public class ShareAsset {

    //This is redundant coding

    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAsset(String symbol, double totalCost) {
        this.symbol = symbol;
        this.totalCost = totalCost;
        this.currentPrice = currentPrice;
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
}
