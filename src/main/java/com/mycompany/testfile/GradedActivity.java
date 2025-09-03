/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testfile;

/**
 *https://github.com/Merrick-Vanier/Programming3_lab_1b
 * @author 6237800
 */
public class GradedActivity {
    protected double score;

    public double getScore() {
        return score;
    }

    public void setScore(double s) {
        this.score = s;
    }
    
    public char getGrade() {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }
}
    
