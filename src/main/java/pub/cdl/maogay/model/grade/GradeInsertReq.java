package pub.cdl.maogay.model.grade;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GradeInsertReq {
    private String student_ID;
    private int score;
}
