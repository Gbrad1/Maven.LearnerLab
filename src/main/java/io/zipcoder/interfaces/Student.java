package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(Long newId, String newName) {
        super(newId, newName);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
