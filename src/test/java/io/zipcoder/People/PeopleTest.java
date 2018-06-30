package io.zipcoder.People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PeopleTest {
    Person instructor;
    People personList = Students.getInstance();

    @Before
    public void setUp() throws Exception {
        instructor = new Instructor(10);
    }

    @Test
    public void testAdd() {
        personList.add(instructor);
        Object actual = personList.get(38);
        Person expected = instructor;

        assertEquals(actual, expected);
    }

    @Test
    public void testSize() {
        personList.add(instructor);
        final int expected = 39;
        int actual = personList.getCount();


        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveByPerson() {
        personList.add(instructor);
        Object expected = instructor;
        Object actual = personList.removeByPerson(instructor);

        assertEquals(expected, actual);
    }

    @Test
    public void removeById() {
        Object expected = personList.findById(10);
        Object actual = personList.removeById(10);

        assertEquals(expected, actual);
    }

    @Test
    public void findById() {
        personList.add(instructor);
        Object expected = instructor;
        Object actual = personList.findById(10);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetArray() {
        Object [] expected = new Object[personList.getArray().length];
        for(int x = 0; x < expected.length; x++){
            expected[x] = personList.get(x);
        }
        Object [] actual = personList.getArray();

        assertEquals(expected, actual);
    }


    @Test
    public void testRemoveAll() {
        personList.add(instructor);
        int expected = 0;
        personList.removeAll();
        int actual = personList.getCount();

        assertEquals(expected, actual);
    }
    }