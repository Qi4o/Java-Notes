package task.market;

/**
 * @Author Qiao
 * @Create 2022/4/1 15:34
 */

public class Person {
    private String name;
    Market market;

    public Person(String name) {
        this.name = name;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public void sell(String productName){
        market.sell(productName);
    }
}
