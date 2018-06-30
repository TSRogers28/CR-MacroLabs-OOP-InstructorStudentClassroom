package io.zipcoder.People;

import java.lang.reflect.Array;
import java.util.ArrayList;

public final class Students extends People <Student>{

    private static final Students students = new Students();

    private Students(){
        for(int x = 0; x < 38; x++){
            super.add(new Student(x +1));
        }
    }

    public static Students getInstance(){
//        if(students == null)
//            students = new Students();
        return students;
    }

    public Student [] getArray(){
        Student[] array = personList.toArray(new Student [0]);
        for (int y = 0; y < array.length; y++) {
            array[y] = personList.get(y);
        }
        return array;
    }

}
