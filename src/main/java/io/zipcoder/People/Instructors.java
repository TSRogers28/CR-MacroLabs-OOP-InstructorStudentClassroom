package io.zipcoder.People;

import java.util.ArrayList;

public final class Instructors extends People <Instructor> {

    private static Instructors instructors = new Instructors();

    private Instructors(){
        for(int x = 0; x < 38; x++){
            super.add(new Instructor(x +1));
        }
    }

    public static Instructors getInstance(){
        if(instructors == null)
            instructors = new Instructors();
        return instructors;
    }

    public Instructor [] getArray(){
        Instructor[] array = personList.toArray(new Instructor[0]);
        for (int y = 0; y < array.length; y++) {
            array[y] = personList.get(y);
        }
        return array;
    }

}
