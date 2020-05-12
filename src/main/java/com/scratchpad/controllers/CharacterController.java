package com.scratchpad.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scratchpad.model.Character;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class CharacterController {
    private ObjectMapper objectMapper;

    public CharacterController() {
        this.objectMapper = new ObjectMapper();
    }

    public <T extends Character> T deserializeCharacter(String path, Class<T> deserializedClass) {
        try {
            return objectMapper.readValue(new ClassPathResource(path).getInputStream(), deserializedClass);
        } catch (Exception ex) {
            System.out.println("Exception occurred! " + ex.getMessage());
            ex.printStackTrace();
            // TODO: An exception occurred, what to do?
        }

        return null;
    }
}
