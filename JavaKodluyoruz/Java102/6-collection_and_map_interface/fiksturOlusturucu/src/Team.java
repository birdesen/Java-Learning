import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;


public class Team {
    ArrayList<String> teams = new ArrayList<>();

    Set<String> playedMatchesFirstRound = new LinkedHashSet<>();

    Set<String> playedMatchesSecondRound = new LinkedHashSet<>();

    ArrayList<String> coupleTeams = new ArrayList<>();

    public static Random random = new Random();

    public void printLeagueFixture() {

        System.out.println("Takımlar");
        for (String team : teams) {
            System.out.println(team);
        }
        if (teams.size() % 2 != 2) {
            teams.add("Bay");
        }
    }

    public void matchRound() {
        ArrayList<String> home = new ArrayList<>();
        ArrayList<String> away = new ArrayList<>();
        for (int i = 0; i < teams.size() - 1; i++) {
            home.clear();
            away.clear();
            while (home.size() < teams.size() / 2) {
                String homeTeam = teams.get(random.nextInt(teams.size()));
                String awayTeam = teams.get(random.nextInt(teams.size()));
                if ((!homeTeam.equals(awayTeam))) {
                    if (coupleTeams.contains(homeTeam = awayTeam) == false && coupleTeams.contains(awayTeam + homeTeam) == false) {
                        if (home.contains(homeTeam) == false && away.contains(awayTeam) == false) {
                            home.add(homeTeam);
                            away.add(awayTeam);
                            coupleTeams.add(awayTeam + homeTeam);
                            coupleTeams.add(homeTeam + awayTeam);

                            playedMatchesFirstRound.add(homeTeam + "vs" + awayTeam);
                            playedMatchesSecondRound.add(awayTeam + "vs" + homeTeam);

                        }
                    }
                }
            }
        }
        int brace = 0;
        int week = 1;
        

    }


}
