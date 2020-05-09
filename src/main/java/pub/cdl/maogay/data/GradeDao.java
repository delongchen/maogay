package pub.cdl.maogay.data;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pub.cdl.maogay.model.grade.GradeBody;
import pub.cdl.maogay.model.grade.GradeInsertReq;

import java.util.List;

@Mapper
public interface GradeDao {
    @Update("update wxsb set score = #{score} where student_ID = #{student_ID}")
    int insertGrade(GradeInsertReq gradeInsertReq);

    @Select("select student_ID, score from wxsb")
    List<GradeBody> getAllScore();
}
