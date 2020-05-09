package pub.cdl.maogay.controller;

import org.springframework.web.bind.annotation.*;
import pub.cdl.maogay.model.Student;
import pub.cdl.maogay.model.auth.LoginReq;
import pub.cdl.maogay.model.auth.LoginRes;
import pub.cdl.maogay.model.auth.RegisterReq;
import pub.cdl.maogay.model.auth.RegisterRes;
import pub.cdl.maogay.service.AuthService;

@RestController
@RequestMapping("/auth")
public class TestController {
    private AuthService authService;

    public TestController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public LoginRes wxsb(@RequestBody LoginReq loginReq) {
        return authService.login(loginReq);
    }

    @PostMapping("/register")
    public RegisterRes wxsb(@RequestBody RegisterReq registerReq) {
        return authService.register(registerReq);
    }
}
