package lukebrannigan57.curricula.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Curriculum {
    private final int id;
    private final String name;
    private final Subject subject;
    private final List<Course> courses;
    // curriculum is mostly made up of courses, and start/end dates
    // a course could be used in multiple curriculum

}
