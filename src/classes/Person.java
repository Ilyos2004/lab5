package classes;

import enums.Color;
import enums.Country;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Integer weight; //Поле не может быть null, Значение поля должно быть больше 0
    private enums.Color eyeColor; //Поле может быть null
    private Color hairColor; //Поле не может быть null
    private Country nationality; //Поле может быть null

    public Person(String name, Integer weight, Color eyeColor, Color hairColor, Country nationality) {
        this.name = name;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }
}
