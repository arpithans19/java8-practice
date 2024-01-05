package com.interview.team;


/*create a list of players in team class
and Find the total sum of score of all players in Team
and group the player based on their type*/
public class Player {
    private String name;
    private int score;
    private String type;

    public Player(String name, int score, String type) {
        this.name = name;
        this.score = score;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", type='" + type + '\'' +
                '}';
    }
}
