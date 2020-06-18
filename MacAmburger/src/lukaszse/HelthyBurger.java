package lukaszse;

public class HelthyBurger extends Hamburger {

    private boolean cheese;
    private boolean eggs;

    public HelthyBurger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
    }

    @Override
    public void addAdditon(String addition) {
        super.addAdditon(addition);

        switch(addition){
            case "cheese":
                this.cheese = true;
                super.price += 2.00;
            case "eggs":
                this.eggs = true;
                super.price += 3.00;
        }
    }
}
