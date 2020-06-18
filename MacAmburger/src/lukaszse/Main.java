package lukaszse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 1;
        int y = 2;
        int z1 = x+++++y;
        int z2 = ++x+y++;


        Hamburger burger = new Hamburger("white", "chicken", 16.99);

        System.out.println(burger.getPrice());

        burger.addAdditon("lettuce");
        burger.addAdditon("carrot");

        System.out.println(burger.getPrice());

        HelthyBurger zdrowiutenki = new HelthyBurger("dark", "beef", 19.99);

        System.out.println(zdrowiutenki.getPrice());
        zdrowiutenki.addAdditon("cheese");
        System.out.println(zdrowiutenki.getPrice());
    }
}
