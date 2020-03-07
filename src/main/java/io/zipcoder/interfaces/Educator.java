package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    DOLIO(new Instructor(1L, "Dolio")),
    NOBLES(new Instructor(2L, "Nobles")),
    ROBERTO(new Instructor(3L, "Roberto")),
    FROILAN(new Instructor(4L, "Froilan")),
    SIAN(new Instructor(5L, "Sian")),
    ;

    final private Instructor instructor;
    double timeWorked;

    Educator(Instructor instructor) {
        this.instructor = instructor;
        this.timeWorked = 0;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
