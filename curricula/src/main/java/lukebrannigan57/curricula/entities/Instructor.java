package lukebrannigan57.curricula.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data

//@RequiredArgsConstructor
public class Instructor extends User{

    private final String bio;
    private final List<Subject> subjects;
    private final List<Course> courses;

    /*
    *
    * bio
    *
    * subjects
    * courses
    * */
}
