package io.zipcoder.People;

import java.util.ArrayList;

public final class Students extends People <Student>{

    private static Students students = new Students();

    private Students(){
        for(int x = 0; x < 38; x++){
            super.add(new Student(x +1));
        }
    }

    public static Students getInstance(){
        if(students == null)
            students = new Students();
        return students;
    }

//    @Override
//    public Student [] getArray() {
//        return this.studentList.toArray(new Student [studentList.size()]);
//    }
}
