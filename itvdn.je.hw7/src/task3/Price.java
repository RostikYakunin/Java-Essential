package task3;

public class Price {
    private String market;
    private String product;
    private int priceInUAH;

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(int priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public Price(String market, String product, int priceInUAH) {
        this.market = market;
        this.product = product;
        this.priceInUAH = priceInUAH;
    }

    @Override
    public String toString() {
        return "Price{" +
                "market='" + market + '\'' +
                ", product='" + product + '\'' +
                ", priceInUAH=" + priceInUAH +
                '}';
    }
}
