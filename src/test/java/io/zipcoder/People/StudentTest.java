package io.zipcoder.People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student;
    @Before
    public void setup(){
        student = new Student(20);
    }

    @Test
    public void testImplementation(){

        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){

        assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        student.learn(10);
        double expected = 10;
        double actual = student.getTotalStudyTime();

        assertEquals(expected, actual, 0);
    }

}