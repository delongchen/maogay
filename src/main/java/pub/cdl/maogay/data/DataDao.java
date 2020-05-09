package pub.cdl.maogay.data;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pub.cdl.maogay.model.upload.UploadBody;

import java.util.List;

@Mapper
public interface DataDao {
    @Insert("insert into wxsbdata (student_ID, value) values (#{student_ID}, #{value})")
    int InsertData(UploadBody req);

    @Insert("insert into wxsbimg (student_ID, value) values (#{student_ID}, #{value})")
    int InsertImg(UploadBody req);

    @Select("select value from wxsbdata where student_ID = #{id}")
    List<String> getDataById(String id);

    @Select("select value from wxsbimg where student_ID = #{id}")
    List<String> getImgById(String id);
}
