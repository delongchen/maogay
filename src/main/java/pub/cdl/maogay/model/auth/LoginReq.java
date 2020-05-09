package pub.cdl.maogay.model.auth;

import lombok.Data;

@Data
public class LoginReq {
    private String name;
    private String password;
}
