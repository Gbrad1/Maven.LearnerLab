package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

public class TestPerson {

    private static final Logger LOGGER = Logger.getLogger(TestPerson.class.getName());
    Person cPerson = new Person();

    @Before
    public void setupTestCase() {

    }

    @Test
    public void personConstructorTest() {
        Long expectedId = 0000L;
        String expectedName = "template";

        Assert.assertEquals(expectedId, cPerson.getId());
        Assert.assertEquals(expectedName, cPerson.getName());
    }

    @Test
    public void getNameTest() {
        String actualName = cPerson.getName();
        String expectedName = "template";

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        cPerson.setName("Amanda");
        String actualName = cPerson.getName();
        String expectedName = "Amanda";

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getIdTest() {
        Long actualName = cPerson.getId();
        Long expectedName = 0000L;

        Assert.assertEquals(expectedName, actualName);
    }
}
