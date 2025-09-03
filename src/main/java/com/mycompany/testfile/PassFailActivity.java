/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testfile;

/**
 *https://github.com/Merrick-Vanier/Programming3_lab_1b
 * @author 6237800
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;
    
    public void PassFailActivity(double mps) {
        this.minPassingScore = mps;
    }
    
    
    @Override
    public char getGrade() {
        if (score >= minPassingScore) return 'P';
        else return 'F';
    }

    public double getMinPassingScore() {
        return minPassingScore;
    }

    public void setMinPassingScore(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }
    
    
    
}
