package models;

import java.util.Arrays;

public class League {
  private String team[];

  public League(String[] team) {
    this.team = team;
  }

  public String[] getTeam() {
    return team;
  }

  public void setTeam(String[] team) {
    this.team = team;
  }

  @Override
  public String toString() {
    return "League [team=" + Arrays.toString(team) + "]";
  }

}
