package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class TestInstructor {
    private static final Logger LOGGER = Logger.getLogger(TestStudent.class.getName());
    Student cStudent = new Student();
    Student cStudent1 = new Student();
    Instructor cInstructor = new Instructor();
    Learner[] listOfStudents = {cStudent, cStudent1};


    @Test
    public void testImplementation() {
        Assert.assertTrue(cInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(cInstructor instanceof Person);
    }

    @Test
    public void testTeach() {
        cInstructor.teach(cStudent, 20.0);
        Double actualHoursStudied = cStudent.getTotalStudyTime();
        Double expectedHoursStudued = 20.0;

        Assert.assertEquals(expectedHoursStudued, actualHoursStudied);
    }

    @Test
    public void testLecture() {
        cInstructor.lecture(listOfStudents, 100.0);
        Double actualStudentStudyTime = cStudent.getTotalStudyTime();
        Double actualStudent1StudyTime = cStudent1.getTotalStudyTime();

        Double expectedStudentStudyTime = 50.0;
        Double expectedStudent1StudyTime = 50.0;

        Assert.assertEquals(expectedStudentStudyTime, actualStudentStudyTime);
        Assert.assertEquals(expectedStudent1StudyTime, actualStudent1StudyTime);
    }

}
