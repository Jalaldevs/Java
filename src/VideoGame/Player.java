package VideoGame;

public class Player {

    // ATRIBUTES

    private long id;
    private String userName;
    private int XP;
    private int level;
    private boolean isVip;

    // CONSTRUCTOR

    public Player(String userName, boolean isVip) {

        if (userName.length() < 4) {
            throw new IllegalArgumentException("Username must be at least 4 characters");
        }
        this.id = id;
        this.userName = userName;
        this.isVip = isVip;
        this.XP = 0;
        this.level = 0;
    }

    // GETTERS & SETTERS

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public int getXP() {
        return XP;
    }

    public int getLevel() {
        return level;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // METHODS

    public void levelUP () {
        if (this.XP >= 1000){
            this.level += this.level;
            this.XP = this.XP % 1000;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "userName='" + userName + '\'' +
                ", XP=" + XP +
                ", level=" + level +
                ", isVip=" + isVip +
                '}';
    }
}
