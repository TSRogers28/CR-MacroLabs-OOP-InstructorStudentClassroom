package io.zipcoder.People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    Person person;
    @Before
    public void setup(){
        person = new Person(10);
    }

    @Test
    public void testGetID(){
        long expected = 10;
        long actual = person.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetAndGetName(){
        person.setName("Kevin Bacon");

        String expected = "Kevin Bacon";
        String actual = person.getName();

        assertEquals(expected, actual);
    }


}
