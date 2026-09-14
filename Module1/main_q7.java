import java.util.Scanner;

class Team {
    protected String name;
    protected int matchesPlayed;
    protected int wins;
    protected int draws;

    public Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    public int calculatePoints() {
        return wins + draws;
    }

    public String getSport() {
        return "Team";
    }

    @Override
    public String toString() {
        return "Team: " + name + " (" + getSport() +
               ") Points: " + calculatePoints();
    }
}

class CricketTeam extends Team {

    public CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (wins * 2) + draws;
    }

    @Override
    public String getSport() {
        return "Cricket";
    }
}

class FootballTeam extends Team {

    public FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (wins * 3) + draws;
    }

    @Override
    public String getSport() {
        return "Football";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cricket
        String[] cricketData = sc.nextLine().split(",");

        Team cricket = new CricketTeam(
                cricketData[1].trim(),
                Integer.parseInt(cricketData[2].trim()),
                Integer.parseInt(cricketData[3].trim()),
                Integer.parseInt(cricketData[4].trim())
        );

        // Football
        String[] footballData = sc.nextLine().split(",");

        Team football = new FootballTeam(
                footballData[1].trim(),
                Integer.parseInt(footballData[2].trim()),
                Integer.parseInt(footballData[3].trim()),
                Integer.parseInt(footballData[4].trim())
        );

        System.out.println(cricket);
        System.out.println(football);

        sc.close();
    }
}
