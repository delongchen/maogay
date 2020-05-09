package pub.cdl.maogay.model.auth;


import lombok.Getter;
import lombok.Setter;
import pub.cdl.maogay.model.ResponseMsg;

@Setter
@Getter
public class LoginRes extends ResponseMsg {
    private String name;
    private String student_ID;
    private String email;
    private String authority;
}
