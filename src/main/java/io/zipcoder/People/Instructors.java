package io.zipcoder.People;

import java.util.ArrayList;

public final class Instructors extends People <Instructor> {

    private static Instructors instructors = new Instructors();
    private ArrayList<Person> instructorList;

    private Instructors(){
        instructorList = new ArrayList<Person>();
        for(int x = 0; x < 38; x++){
            super.add(new Instructor(x +1));
        }
    }

    public static Instructors getInstance(){
        if(instructors == null)
            instructors = new Instructors();
        System.out.println(instructors.instructorList.size());
        return instructors;
    }

    @Override
    public Instructor [] getArray() {
        return this.instructorList.toArray(new Instructor [instructorList.size()]);
    }
}
