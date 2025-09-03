/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testfile;

/**
 *
 * @author 6237800
 */
public class CourseGrades implements Analyzable {
    private GradedActivity grades[];
    private int NUM_GRADES = 4;

    public CourseGrades() {
    }
    
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }
    
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }
    
    @Override
    public String toString() {
        return("Lab Score: " + grades[0].score + "  Grade: " + grades[0].getGrade() +
        "\nPass/Fail Exam Score: " + grades[1].score + "  Grade: " + grades[1].getGrade() +
        "\nEssay Score: " + grades[2].score + "  Grade: " + grades[2].getGrade() +
        "\nFinal Exam Score: " + grades[3].score + "  Grade: " + grades[3].getGrade());
    }

    @Override
    public double getAverage() {
        return ((grades[0].getScore() + 
                grades[1].getScore() + 
                grades[2].getScore() + 
                grades[3].getScore())/4);
    }

    @Override
    public GradedActivity getHighest() {
        
    }

    @Override
    public GradedActivity getLowest() {
        
    }
    
    
}
