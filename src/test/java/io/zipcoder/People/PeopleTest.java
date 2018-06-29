package io.zipcoder.People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PeopleTest {
    Person instructor;
    Person student;
    Person student2;
    Person student3;
    Person student4;
    Person student5;
    People personList;

    @Before
    public void setUp() throws Exception {
        instructor = new Instructor(10);
        student = new Student(11);
        student2 = new Student(21);
        student3 = new Student(22);
        student4 = new Student(23);
        student5 = new Student(24);
        personList = new People();
    }

    @Test
    public void testAdd() {
        personList.add(instructor);
        Person actual = personList.get(0);
        Person expected = instructor;

        assertEquals(actual, expected);
    }

    @Test
    public void testSize() {
        personList.add(instructor);
        personList.add(student2);
        personList.add(student3);
        int actual = personList.getCount();
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemoveByPerson() {
        personList.add(instructor);
        personList.add(student2);
        personList.add(student3);
        Person expected = instructor;
        Person actual = personList.removeByPerson(instructor);

        assertEquals(expected, actual);
    }

    @Test
    public void removeById() {
        personList.add(instructor);
        personList.add(student2);
        personList.add(student3);
        Person expected = instructor;
        Person actual = personList.removeById(10);

        assertEquals(expected, actual);
    }

    @Test
    public void findById() {
        personList.add(instructor);
        personList.add(student2);
        personList.add(student3);
        Person expected = instructor;
        Person actual = personList.findById(10);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetArray() {
        personList.add(instructor);
        personList.add(student2);
        personList.add(student3);
        Person [] expected = {instructor, student2, student3};
        Person [] actual = personList.getArray();

        assertEquals(expected, actual);
    }
    @Test
    public void testRemoveAll() {
        personList.add(instructor);
        personList.add(student2);
        personList.add(student3);
        int expected = 0;
        personList.removeAll();
        int actual = personList.getCount();

        assertEquals(expected, actual);
    }
    }