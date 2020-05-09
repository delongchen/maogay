package pub.cdl.maogay.model;

import lombok.Data;

@Data
public class Student {
    private String name;
    private String password;
    private String student_ID;
    private String email;
    private String authority;
    private int score;
}
