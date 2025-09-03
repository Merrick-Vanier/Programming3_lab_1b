/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testfile;

/**
 * https://github.com/Merrick-Vanier/Programming3_lab_1b
 * @author 6237800
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int questions, int missed, double minPassing) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100/questions;
        setMinPassingScore(minPassing);
        setScore(100 - (this.numMissed * pointsEach));
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    @Override
    public String toString() {
                return "Each question is worth " + pointsEach + " points each.\n" +
                "The exam score is " + getScore() + "\n" +
                "The exam grade is " + getGrade();
    }
    
    
    
}
