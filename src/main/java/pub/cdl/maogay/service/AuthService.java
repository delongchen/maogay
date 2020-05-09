package pub.cdl.maogay.service;

import org.springframework.stereotype.Service;
import pub.cdl.maogay.data.AuthDao;
import pub.cdl.maogay.model.Student;
import pub.cdl.maogay.model.auth.LoginReq;
import pub.cdl.maogay.model.auth.LoginRes;
import pub.cdl.maogay.model.auth.RegisterReq;
import pub.cdl.maogay.model.auth.RegisterRes;

@Service
public class AuthService {
    private AuthDao auth;

    public AuthService(AuthDao auth) {
        this.auth = auth;
    }

    public LoginRes login(LoginReq loginReq) {
        var ret = new LoginRes();
        var stu = auth.getStuInfo(loginReq.getName());

        if (stu == null || !stu.getPassword().equals(loginReq.getPassword())) {
            ret.setMsg(stu == null ? "no such a user": "password error");
            ret.setStatus("false");
        } else {
            ret.setStatus("ok");
            ret.setMsg("login ok");
            ret.setAuthority(stu.getAuthority());
            ret.setEmail(stu.getEmail());
            ret.setName(stu.getName());
            ret.setStudent_ID(stu.getStudent_ID());
        }
        return ret;
    }

    public RegisterRes register(RegisterReq registerReq) {
        var ret = new RegisterRes();
        var stu = auth.getStuInfoById(registerReq.getStudent_ID());

        if (stu != null) {
            ret.setMsg("already exist");
            ret.setStatus("false");
        } else {
            ret.setMsg("ok " + auth.register(registerReq));
            ret.setStatus("ok");
        }

        return ret;
    }
}
