package models;

import java.util.Arrays;

public class Team {
  private String players[];

  public Team(String[] players) {
    this.players = players;
  }

  public String[] getPlayers() {
    return players;
  }

  public void setPlayers(String[] players) {
    this.players = players;
  }

  @Override
  public String toString() {
    return "Team [players=" + Arrays.toString(players) + "]";
  }

  

}
