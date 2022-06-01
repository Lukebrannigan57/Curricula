package lukebrannigan57.curricula.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Material {
    private final int id;
    private final String title;
    private final String author;
    private final Subject subject;
    private final String description;
    private final String link;

}
