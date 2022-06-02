package lukebrannigan57.curricula.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    private final int id;
    private final String userName;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String address1;
    private final String address2;
    private final String city;
    private final String state;
    private final String zip;
    private final String role;

}
