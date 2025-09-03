/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testfile;

/**
 *
 * @author 6237800
 */
public class PassFailExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int numQuestions, double pointsEach, int numMissed) {
        this.numQuestions = numQuestions;
        this.pointsEach = pointsEach;
        this.numMissed = numMissed;
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
    
    
}
