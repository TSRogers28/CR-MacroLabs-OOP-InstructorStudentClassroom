package io.zipcoder.People;

import java.util.ArrayList;
import java.util.Collection;

public class People {

    private ArrayList<Person> personList;

    public People(){
        personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person get(int i) {
       return personList.get(i);
    }

    public int getCount(){
       return this.personList.size();
    }

    public Person removeByPerson(Person target) {
        Person foundPerson = null;
        for(Person person: personList)
           if(person.equals(target))
               foundPerson = person;
        personList.remove(target);
        return foundPerson;
    }

    public Person removeById(int id) {
        Person foundPerson = null;
        for(Person person: personList)
            if(id == person.getId())
                foundPerson = person;
        personList.remove(foundPerson);
        return foundPerson;
    }

    public Person findById(int id) {
        Person foundPerson = null;
        for(Person person: personList)
            if(id == person.getId())
                foundPerson = person;
        return foundPerson;
    }

    public Object [] getArray() {
       return personList.toArray();
    }

    public void removeAll() {
        personList.clear();
    }
}
