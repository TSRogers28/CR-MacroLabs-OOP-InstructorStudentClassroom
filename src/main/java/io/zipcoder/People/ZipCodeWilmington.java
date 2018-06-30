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
            Object theInstructor = instructors.findById((int)id);
            Instructor instructor = (Instructor) theInstructor;
            Learner [] learners = studentList.getArray();
                    instructor.lecture(learners, numOfHours);
                }
            }





