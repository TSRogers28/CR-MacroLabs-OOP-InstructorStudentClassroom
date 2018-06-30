package io.zipcoder.People;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InstructorsTest {
    Person instructor;
    Person instructor2;
    Person instructor3;

    @Before
    public void setup() {
        instructor = new Instructor(11);
        instructor2 = new Instructor(21);
        instructor3 = new Instructor(22);
    }

    @Test
    public void testSingletonInstance() {
        Instructors instance1 = Instructors.getInstance();
        Instructors instance2 = Instructors.getInstance();

        Assert.assertSame(instance1, instance2);
    }

    @Test
    public void testInitializationSetupStudents() {
        Instructors instance = Instructors.getInstance();
        Person [] testArray = instance.getArray();
        int expected = 38;
        int actual = testArray.length;


        Assert.assertSame(expected, actual);

    }

    @Test
    public void testInitializationSetupStudentsID() {
        Instructors instance = Instructors.getInstance();
        Person[] testArray = instance.getArray();
        int actual = 0;
        for (Person student : testArray) {
            actual += (int) student.getId();
        }

        int expected = (testArray.length * (testArray.length + 1)) / 2;

        Assert.assertEquals(expected, actual);

    }

}