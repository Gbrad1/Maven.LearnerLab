package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    Students student = Students.getInstance();

    @Test
    public void testStudentConstructor() {
        String actualName = student.findById(1L).getName();
        String expectedName = "Giles";
        Assert.assertEquals(expectedName, actualName);
    }
}
