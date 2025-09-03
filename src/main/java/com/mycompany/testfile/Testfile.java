/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testfile;
import java.util.*;
/**
 *
 * @author Nagat
 */
public class Testfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double inputScore;
        GradedActivity grade = new GradedActivity();
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert the student's grade: ");
        inputScore = input.nextDouble();
        grade.setScore(inputScore);
        System.out.println("Thie Letter grade is " + grade.getGrade());
        System.out.println("\n");
        
        System.out.print("How many questions are on the final exam? ");
        int numberOfQ1 = input.nextInt();
        System.out.print("How many questions did the student miss? ");
        int missedQ1 = input.nextInt();
        System.out.println(new FinalExam(numberOfQ1, missedQ1).toString());
        System.out.println("\n");
        
        System.out.print("How many questions are on the final exam? ");
        int numberOfQ2 = input.nextInt();
        System.out.print("How many questions did the student miss? ");
        int missedQ2 = input.nextInt();
        System.out.print("What is the passing score? ");
        double passingScore = input.nextDouble();
        System.out.println(new PassFailExam(numberOfQ2, missedQ2, passingScore).toString());
        System.out.println("\n");
        
        Essay essay = new Essay();
        essay.setScore(25.0, 18.0, 20.0, 25.0);
        System.out.println(essay);
        System.out.println("\n");
        
        CourseGrades course = new CourseGrades();
        course.setEssay(essay);
        course.setPassFailExam(new PassFailExam(numberOfQ2, missedQ2, passingScore));
        course.setLab(grade);
        course.setFinalExam(new FinalExam(numberOfQ1, missedQ1));
        System.out.println(course);

    }
    
}