package lukaszse;

import java.math.BigDecimal;

public class Hamburger {

    private String breadRollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean mushroms;
    protected double price;

    public Hamburger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void addAdditon(String addition){
        switch (addition){
            case "lettuce":
                this.lettuce = true;
                price += 1.00;
                break;
            case "tomato":
                this.tomato = true;
                price += 1.00;
                break;
            case "carrot":
                this.carrot = true;
                price += 1.00;
                break;
            case "mushroms":
                this.mushroms = true;
                price += 1.00;
                break;
            default:
                break;
        }

    }
}
