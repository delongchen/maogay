package pub.cdl.maogay.service;

import org.springframework.stereotype.Service;
import pub.cdl.maogay.data.AuthDao;
import pub.cdl.maogay.data.GradeDao;
import pub.cdl.maogay.model.grade.GradeInfos;
import pub.cdl.maogay.model.grade.GradeInsertReq;
import pub.cdl.maogay.model.grade.GradeInsertRes;

@Service
public class GradeService {
    private AuthDao auth;
    private GradeDao grade;

    public GradeService(AuthDao auth, GradeDao grade) {
        this.auth = auth;
        this.grade = grade;
    }

    public GradeInsertRes gradeInsert(GradeInsertReq gradeInsertReq) {
        var ret = new GradeInsertRes();
        var stu = auth.getStuInfoById(gradeInsertReq.getStudent_ID());

        if (stu == null) {
            ret.setStatus("false");
            ret.setMsg("no such a user");
        } else {
            ret.setMsg("ok " + grade.insertGrade(gradeInsertReq));
            ret.setStatus("ok");
        }

        return ret;
    }

    public GradeInfos getAllScore() {
        var ret = new GradeInfos();
        ret.setValue(grade.getAllScore());
        ret.setMsg("ok get");
        ret.setStatus("ok");
        return ret;
    }
}
