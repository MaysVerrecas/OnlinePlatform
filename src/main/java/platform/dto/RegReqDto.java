package platform.dto;

import lombok.Data;
import platform.security.dto.Role;
@Data
public class RegReqDto {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private Role role;

}
