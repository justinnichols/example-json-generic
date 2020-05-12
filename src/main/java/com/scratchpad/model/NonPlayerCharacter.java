package com.scratchpad.model;

import com.scratchpad.model.enums.NPCType;

/*
    The JSON that represents this would look something like:
    {
        "npcType": "MONSTER",
        "race": "Cyclops",
        "characterClass": "Warrior",
        "level": 7,
        "strength": 19,
        "dexterity": 14,
        "constitution": 18,
        "intelligence": 8,
        "wisdom": 10,
        "charisma": 7
    }
 */
public class NonPlayerCharacter extends Character {
    private NPCType npcType;

    public NPCType getNpcType() {
        return npcType;
    }

    public void setNpcType(NPCType npcType) {
        this.npcType = npcType;
    }
}
