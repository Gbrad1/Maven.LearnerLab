package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestZipCodeWilmington {

    ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
    Instructors instructor = Instructors.getInstance();
    Students students = Students.getInstance();

    @Test
    public void testHostLecture() {
        zcw.hostLecture(Educator.DOLIO, 12);
        Double expected = 12.0 / students.getListSize();
        LinkedHashMap<Student, Double> map = zcw.getStudyMap();

        for (Map.Entry<Student, Double> element : map.entrySet()) {
            Double actual = element.getKey().getTotalStudyTime();
            Assert.assertEquals(expected, actual);
        }
    }
}
