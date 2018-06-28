package io.zipcoder.People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InstructorTest {
    Instructor instructor;
    Student student;
    Student student2;
    Student student3;
    Student student4;
    Student student5;
    Student [] students;

    @Before
    public void setUp() throws Exception {
        instructor = new Instructor(10);
        student = new Student(20);
        student2 = new Student(21);
        student3 = new Student(22);
        student4 = new Student(23);
        student5 = new Student(24);
        students = new Student[] {student, student2, student3, student4, student5};
    }

    @Test
    public void testImplementation(){

        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){

        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        instructor.teach(student, 10);

        double expected = 10;
        double actual = student.getTotalStudyTime();

        assertEquals(expected, actual, 0);
    }

    @Test
    public void testLectureFirstStudent(){
        instructor.lecture(students, 10);

        double expected = 2;
        double actual = students[0].getTotalStudyTime();

        assertEquals(expected, actual, 0);
    }

    @Test
    public void testLectureMiddleStudent(){
        instructor.lecture(students, 10);

        double expected = 2;
        double actual = students[2].getTotalStudyTime();

        assertEquals(expected, actual, 0);
    }

    @Test
    public void testLectureLastStudent(){
        instructor.lecture(students, 10);

        double expected = 2;
        double actual = students[4].getTotalStudyTime();

        assertEquals(expected, actual, 0);
    }
}
