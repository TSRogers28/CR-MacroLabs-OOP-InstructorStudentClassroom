package io.zipcoder.People;

import java.util.ArrayList;

public abstract class  People <T> {

//    interface PersonListGenerator<T> {
//        public ArrayList<T> getInstance();
//    }

    private ArrayList<T> personList;

//    public class ListMarker extends People {
//        public ArrayList<T> getInstance() {
//            if (personList == null)
//        personList = new ArrayList<>();
//            return personList;
//    }

//        @Override
//        public Object[] getArray() {
//            Object [] array = getInstance().toArray();
//            return array;
//        }
//    }

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

    public abstract T [] getArray();

    public void removeAll() {
        personList.clear();
    }
}
