package io.zipcoder.People;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;


public class ZipCodeWilmingtonTest {
    ZipCodeWilmington zipCodeWilmington;
    Instructor instructor;

    @Before
    public void setup() {
        zipCodeWilmington = new ZipCodeWilmington();
        instructor = new Instructor(10);
    }



    @Test
    public void testHostLecture() {
        double numOfHours = 10;

        zipCodeWilmington.hostLecture(10, numOfHours);
        Student [] students = Students.getInstance().getArray();
        //for(Student student:  Students.getInstance().getArray())
        double expected =  students[0].getTotalStudyTime();
        double actual = numOfHours/Students.getInstance().getArray().length;

        Assert.assertEquals(expected, actual, 0);
    }


    }





