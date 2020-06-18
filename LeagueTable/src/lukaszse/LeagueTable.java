package lukaszse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    private String leagueName;

    ArrayList<T> leagueTeams = new ArrayList<>();

    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void printTeams() {
        System.out.println(leagueTeams.toString());
    }

    public boolean addTeam (T team) {
        if(leagueTeams.contains(team)){
            System.out.println(team.getTeamName() + " team already exist.");
            return false;
        } else {
            leagueTeams.add(team);
            System.out.println(team.getTeamName() + " was added to league: " + this.getLeagueName());
            return true;
        }
    }

    public void printSorted(){
        Collections.sort(leagueTeams);
        System.out.println(leagueTeams.toString());
    }
}
