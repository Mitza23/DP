package org.example;

public class Professor {

    private StudentYear studentYear;
    public void requireExamPlanning(String examName) {
        studentYear.planExam(examName);
    }
}
