import java.util.*;

public class Team {
    public ArrayList<String> teams = new ArrayList<>();
    public ArrayList<String> weeksfix = new ArrayList<>();
    public ArrayList<String> weekrevenge = new ArrayList<>();
    public int week = 0;

    public Team() {
        teams.add("Beşiktaş");
        teams.add("Fenerbahce");
        teams.add("Galatasaray");
        teams.add("Trabzonspor");
        teams.add("Eskişehirspor");
        teams.add("Gençlerbirliği");

        for (String team : teams) {
            System.out.println("- " + team);
        }
        if (this.teams.size() % 2 != 0) {
            this.teams.add("BAY");
        }
        this.Fixturing();
    }

    public void Fixturing() {
        System.out.println("--------- Fikstur ----------");

        while (this.week < this.teams.size() - 1) {
            this.week++;
            System.out.println(this.week + ". Hafta");
            Random random = new Random();
            int match = 0;
            ArrayList<String> copy = new ArrayList<>();
            while (match < teams.size() / 2) {
                String home = this.teams.get(random.nextInt(teams.size()));
                String away = this.teams.get(random.nextInt(teams.size()));
                if (!home.equals(away) && !copy.contains(home) && !copy.contains(away) && !weeksfix.contains(home + away) && !weekrevenge.contains(home + " vs " + away)) {
                    copy.add(home);
                    copy.add(away);
                    weeksfix.add(home + away);
                    this.weekrevenge.add(away + " vs " + home);
                    System.out.println(home + " vs " + away);
                    match++;
                }
            }
        }
        this.printRevenge();
    }

    public void printRevenge() {
        System.out.println((this.week + 1) + ". Hafta");
        int matches = 0;
        for (String match : weekrevenge) {
            matches++;
            System.out.println(match);
            if (matches > this.teams.size() / 2 - 1) {
                this.week++;
                if (this.week < (this.teams.size() - 1) * 2) {
                    System.out.println(this.week + 1 + ". Hafta");
                }
                matches = 0;
            }
        }
    }
}
