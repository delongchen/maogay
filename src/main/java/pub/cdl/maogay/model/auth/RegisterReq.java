package pub.cdl.maogay.model.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterReq {
    private String name;
    private String password;
    private String email;
    private String student_ID;
}
