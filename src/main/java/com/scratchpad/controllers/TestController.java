package com.scratchpad.controllers;

import com.scratchpad.model.NonPlayerCharacter;
import com.scratchpad.model.PlayerCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestController {
    private CharacterController characterController;
    private PlayerCharacter troyCharacter;
    private NonPlayerCharacter cyclops;

    @Autowired
    public TestController(CharacterController characterController) {
        // CharacterController is injected into this constructor by the Spring Boot application
        PlayerCharacter troyCharacter = characterController.deserializeCharacter("/troy.json", PlayerCharacter.class);
        NonPlayerCharacter cyclopsCharacter = characterController.deserializeCharacter("/cyclops.json", NonPlayerCharacter.class);

        System.out.println("\n\n\nClass of Troy: " + troyCharacter.getCharacterClass());
        System.out.println("\nClass of Cyclops: " + cyclopsCharacter.getCharacterClass());
        System.out.println("\n\n\n");
    }
}
