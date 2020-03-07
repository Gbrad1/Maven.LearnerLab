package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructors {

    Instructors instructors = Instructors.getInstance();

    @Test
    public void test() {
        int actualSize = instructors.getListSize();
        int expectedSize = 5;

        Assert.assertEquals(expectedSize, actualSize);
    }

}
