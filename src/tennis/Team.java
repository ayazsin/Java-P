package tennis;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends TennisCapable> {

    public List<T> teamlist;
    private String name;

    public Team(String name) {
        this.name = name;
        this.teamlist = new ArrayList<>();
    }


    public void addPlayer(T player) {
        this.teamlist.add(player);
    }

    public void deletePlayer(T player) {
        this.teamlist.remove(player);
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamlist=" + teamlist +
                '}';
    }
}
