package SpecialSaleMarket;

public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;

    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = discountRate;
        if (discountRate < 0 || discountRate > 100) {
            this.discountRate = 0;
        }
    }

    public MarketGood(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = 0;
    }

    public String getName() {
        return name;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int newDiscountRate) {
        this.discountRate = newDiscountRate;
    }

    public int getDiscountedPrice() {
        return ((int)(retailPrice * ((double) (100 - discountRate) / 100)));
    }

}
