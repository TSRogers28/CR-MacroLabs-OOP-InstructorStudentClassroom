package io.zipcoder.People;

import java.util.ArrayList;

public final class Instructors extends People {

    private static Instructors instructors = new Instructors();
    private ArrayList<Person> studentList;

    private Instructors(){
        studentList = new ArrayList<Person>();
        for(int x = 0; x < 38; x++){
            super.add(new Student(x +1));
        }
    }

    public static Instructors getInstance(){
        if(instructors == null)
            instructors = new Instructors();
        return instructors;
    }
}
