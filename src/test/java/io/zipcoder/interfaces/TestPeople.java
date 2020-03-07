package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    Students student = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    @Test
    public void testAdd() {
        student.add(new Student(4L, "Maurice"));
        Assert.assertTrue(student.checkListForPerson(student.findById(4L)));
    }

    @Test
    public void testRemovePerson() {
        student.add(new Student(5L, "Kimmy"));
        student.removePersonById(5L);
        Assert.assertFalse(student.checkListForPerson(student.findById(5L)));
    }

    @Test
    public void testFindById() {
        student.add(new Student(4L, "Maurice"));
        Assert.assertTrue(student.checkListForPerson(student.findById(4L)));
    }

}
