package lukaszse;

public abstract class Team<T> implements Comparable<Team<T>>{

    private String teamName;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking())
            return -1;
        else if (this.ranking() < team.ranking())
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        String toString = this.getTeamName() + "zdobyło punktów: " + this.ranking();
        return toString;
    }
}
