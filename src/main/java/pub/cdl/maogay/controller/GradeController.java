package pub.cdl.maogay.controller;

import org.springframework.web.bind.annotation.*;
import pub.cdl.maogay.model.grade.GradeInfos;
import pub.cdl.maogay.model.grade.GradeInsertReq;
import pub.cdl.maogay.model.grade.GradeInsertRes;
import pub.cdl.maogay.service.GradeService;

@RestController
@RequestMapping("/grade")
public class GradeController {
    private GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @PostMapping("/insert")
    public GradeInsertRes gradeInsert(@RequestBody GradeInsertReq gradeInsertReq) {
        return gradeService.gradeInsert(gradeInsertReq);
    }

    @GetMapping("/all")
    public GradeInfos getInfos() {
        return gradeService.getAllScore();
    }
}
