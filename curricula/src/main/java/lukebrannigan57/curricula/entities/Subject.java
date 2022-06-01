package lukebrannigan57.curricula.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Subject {
    private final int id;
    private final String name;
    private final String description;

}
