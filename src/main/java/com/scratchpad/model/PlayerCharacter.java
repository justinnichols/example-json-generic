package com.scratchpad.model;

/*
    The JSON that represents this would look something like:
    {
        "playerName": "Troy Pilewski",
        "race": "Human",
        "characterClass": "Wizard",
        "level": 5,
        "strength": 10,
        "dexterity": 14,
        "constitution": 16,
        "intelligence": 18,
        "wisdom": 16,
        "charisma": 12
    }
 */
public class PlayerCharacter extends Character {
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
