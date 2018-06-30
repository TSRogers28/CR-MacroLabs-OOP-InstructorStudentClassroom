package io.zipcoder.People;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentsTest {
    Person student;
    Person student2;
    Person student3;

    @Before
    public void setup(){
        student = new Student(11);
        student2 = new Student(21);
        student3 = new Student(22);
    }

    @Test
    public void testSingletonInstance(){
      Students instance1 =  Students.getInstance();
      Students instance2 =  Students.getInstance();

        Assert.assertSame(instance1, instance2);
    }

    @Test
    public void testInitializationSetupStudents(){
        Students instance = Students.getInstance();
        Person [] testArray = instance.getArray();
        System.out.println(instance.getArray().length);
        int expected = 38;
        int actual = testArray.length;


        Assert.assertSame(expected, actual);

    }

    @Test
    public void testInitializationSetupStudentsID(){
        Students instance = Students.getInstance();
        Person [] testArray = instance.getArray();
        int [] checkID = new int[testArray.length];
        int actual = 0;
        int x = 0;
        for(Person student: testArray){
            checkID[x] = (int) student.getId();
            actual += (int) student.getId();
        }

        int expected = (testArray.length*(testArray.length +1) )/ 2;

        Assert.assertEquals(expected, actual);

    }
}
