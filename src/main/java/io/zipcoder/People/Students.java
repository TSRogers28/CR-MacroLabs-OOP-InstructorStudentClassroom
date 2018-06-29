package io.zipcoder.People;

import java.util.ArrayList;

public final class Students extends People{

    private static Students students = new Students();
    private ArrayList<Person> studentList;

    private Students(){
        studentList = new ArrayList<Person>();
        for(int x = 0; x < 38; x++){
            super.add(new Student(x +1));
        }
    }

    public static Students getInstance(){
        if(students == null)
            students = new Students();
        return students;
    }
}
