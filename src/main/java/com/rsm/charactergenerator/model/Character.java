package com.rsm.charactergenerator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static java.util.Objects.nonNull;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Gender gender;
    private Breed breed;
    private String image;

    public Character() {
    }

    public Character(CharacterDTO characterDTO) {
        this();
        this.name = nonNull(characterDTO.getName()) ? characterDTO.getName() : "John";
        this.gender = nonNull(characterDTO.getGender()) ? characterDTO.getGender() : Gender.MALE;
        this.breed = nonNull(characterDTO.getBreed()) ? characterDTO.getBreed() : Breed.VILLAGER;
        this.image = nonNull(characterDTO.getImage()) ? characterDTO.getImage() : "src/main/resources/static/images/vill-m.png";
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}