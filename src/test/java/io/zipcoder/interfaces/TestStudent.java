package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class TestStudent {
    private static final Logger LOGGER = Logger.getLogger(TestStudent.class.getName());
    Student cStudent = new Student();

    @Test
    public void testImplementation() {
        Assert.assertTrue(cStudent instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(cStudent instanceof Person);
    }

    @Test
    public void testLearn() {
        cStudent.learn(10.0);
        Double hoursStudied = cStudent.getTotalStudyTime();
        Double expectedHoursStudied = 10.0;

        Assert.assertEquals(expectedHoursStudied, hoursStudied);
    }

    @Test
    public void getTotalStudyTime() {
        cStudent.learn(10.0);
        Double actualTotalStudyTime = cStudent.getTotalStudyTime();
        Double expectedTotalStudyTime = 10.0;
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime);
    }

}
