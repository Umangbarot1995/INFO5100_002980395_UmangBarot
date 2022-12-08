package model;

import java.util.ArrayList;
import java.util.Random;

public class Student {
    String name;
    int id;
    ArrayList<Integer> score;
    Random rand = new Random();

    public Student(String name, int id, ArrayList<Integer> score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Integer> getScore() {
        return score;
    }

}