package io.zipcoder.People;

import java.util.ArrayList;

public class ZipCodeWilmington {

        Students studentList;

        Instructors instructors;

        ZipCodeWilmington(){
            studentList = Students.getInstance();
            instructors = Instructors.getInstance();
        }

        public void hostLecture(long id, double numOfHours){
            Instructor theInstructor = instructors.findById((int)id);
            Learner [] learners = studentList.getArray();
                    theInstructor.lecture(learners, numOfHours);
                }
            }





