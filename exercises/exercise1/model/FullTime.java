package model;

import java.util.ArrayList;

public class FullTime extends Student {
    // public int[] examScore;
    public ArrayList<Integer> examScore;

    public FullTime(String name, int id, ArrayList<Integer> score, ArrayList<Integer> examScore) {
        super(name, id, score);
        this.examScore = examScore;
    }

    public ArrayList<Integer> printExamScore() {
        return examScore;
    }

}
