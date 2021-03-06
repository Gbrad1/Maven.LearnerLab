package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(Long newId, String newName) {
        super(newId, newName);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner element : learners) {
            element.learn(numberOfHours / learners.length);
        }
    }
}
