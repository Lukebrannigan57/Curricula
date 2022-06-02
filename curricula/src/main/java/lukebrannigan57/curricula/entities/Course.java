package lukebrannigan57.curricula.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Course {
    private final int id;
    private final String courseName;
    private final Subject subject;
    private final String description;
    private final Instructor instructor;
    private final String startDate;
    private final String endDate;

}
