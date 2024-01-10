/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composition;

/**
 *
 * @author samih
 */
public class OgrenciComposition {
    private String name;
    private String surname;
    private String age;
    private String score;

    public OgrenciComposition(String name, String surname, String age, String score) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "OgrenciComposition{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", score=" + score + '}';
    }
    
}
