package lukaszse;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("\n");

        FootbalTeam legiaWarszawa = new FootbalTeam("Legia Warszawa");
        FootbalTeam gksKatowice = new FootbalTeam("GKS Katowice");
        FootbalTeam uniaBieruńStary = new FootbalTeam("UNIA Bieruń Stary");
        FootbalTeam stonkaBojszowy = new FootbalTeam("STONKA Bojszowy");
        HockeyTeam gksTychy = new HockeyTeam("GKS Tychy");
        VolleyBallTeam reprezentacjaPolski = new VolleyBallTeam("Reprezentacja Polski");

        LeagueTable<FootbalTeam> ekstraklasa = new LeagueTable<>("Polska Ekstraklasa");

        ekstraklasa.addTeam(gksKatowice);
        ekstraklasa.addTeam(gksKatowice);
        ekstraklasa.addTeam(legiaWarszawa);
        //ekstraklasa.addTeam(gksTychy);     //it won't work anymore, since you use generic class
        ekstraklasa.addTeam(uniaBieruńStary);
        ekstraklasa.addTeam(stonkaBojszowy);

        uniaBieruńStary.matchResult(legiaWarszawa, 10, 0);
        uniaBieruńStary.matchResult(gksKatowice,7,0);
        stonkaBojszowy.matchResult(gksKatowice,2,0);
        legiaWarszawa.matchResult(gksKatowice,0,5);

        System.out.println(gksKatowice.compareTo(legiaWarszawa));

        ekstraklasa.printSorted();

    }
}
