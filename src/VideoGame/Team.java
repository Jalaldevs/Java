package VideoGame;

public class Team {

    // ATRIBUTES

    private long id;
    private String name;
    private Player[] players = new Player[4];
    private int XP;
    private int level;


    // CONSTRUCTOR

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;

        for (int i = 0; i < players.length; i++) {
            int playerLevel = players[i].getLevel();
            this.level += playerLevel;
            int playerXP = players[i].getXP();
            this.XP += playerXP;
        }

    }

    // GETTERS & SETTERS

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public int getXP() {
        return XP;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }
}
