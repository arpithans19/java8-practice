package com.interview.team;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*create a list of players in team class
and Find the total sum of score of all players in Team
and group the player based on their type*/

public class Team {

    public static void main(String[] args) {

        List<Player> playersList = new ArrayList<>();

        playersList.add(new Player("abc", 60, "batsman"));
        playersList.add(new Player("ijk", 80, "batsman"));
        playersList.add(new Player("lmn", 9, "bowler"));
        playersList.add(new Player("ksk", 92, "bowler"));
        playersList.add(new Player("sd", 93, "bowler"));


        //finding sum of score of all player
        int sum = playersList.stream().mapToInt(x -> x.getScore()).sum();
        System.out.println("sum: " + sum);
        //or
        int sum1 = playersList.stream().mapToInt(x -> x.getScore()).reduce(0, (a, b) -> a + b);
        System.out.println("sum1: " + sum1);


//        group the player based on their type
       Map<String,List<Player>> map= playersList.stream().collect(Collectors.groupingBy(Player::getType));
        System.out.println(map.toString());

    }
}
