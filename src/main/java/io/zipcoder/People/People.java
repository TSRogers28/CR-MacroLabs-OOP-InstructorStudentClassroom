package io.zipcoder.People;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class  People <T> {

    private ArrayList<T> personList;

    public People() {
        personList = new ArrayList<>();
    }


    public void add(T t) {
        personList.add(t);
    }

    public T get(int i) {
       return personList.get(i);
    }

    public int getCount(){
       return this.personList.size();
    }


    public T removeByPerson(T target) {
        T foundPerson = null;
        for(T person: personList)
           if(person.equals(target)) {
               foundPerson = person;
           }
        personList.remove(target);
        return foundPerson;
    }

    public T removeById(int id) {
        T foundPerson = null;
        Person cPerson = null;
        for(T person: personList) {
            if (person instanceof Person)
                cPerson = (Person) person;
            if (id == cPerson.getId())
                foundPerson = person;
        }
        personList.remove(foundPerson);
        return foundPerson;
    }

    public T findById(int id) {
        T foundPerson = null;
        Person cPerson = null;
        for(T person: personList){
            if (person instanceof Person)
                cPerson = (Person) person;
            if(id == cPerson.getId())
                foundPerson = person;
        }
        return foundPerson;
    }

    public T [] getArray(){
        T[] array =  (T[]) Array.newInstance( Person[].class.getComponentType(), personList.size());
        for (int y = 0; y < array.length; y++) {
            array[y] = personList.get(y);
        }
        return array;
    }

    public void removeAll() {
        personList.clear();
    }
}
