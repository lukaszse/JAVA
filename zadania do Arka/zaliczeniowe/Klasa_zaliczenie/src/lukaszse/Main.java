package lukaszse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student domyslny = new Student();
        Student ferdek = new Student("Ferdynand", "Kiepski", "grupa specjalna", 6);

        domyslny.wypiszOceny();
        ferdek.wypiszOceny();

        ferdek.wpiszOcene(3);
        ferdek.wpiszOcene(5);
        ferdek.wpiszOcene(3);
        ferdek.wpiszOcene(4);
        ferdek.wpiszOcene(5);
        ferdek.wpiszOcene(4.5);

        ferdek.wypiszOceny();

        System.out.println("srednia: " + ferdek.sredniaOcen());

        System.out.println("Zaliczenie: " + ferdek.sesjaZaliczona());
        System.out.println("Stypendium: " + ferdek.stypendium());
    }
}
