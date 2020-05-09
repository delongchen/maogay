package pub.cdl.maogay.data;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pub.cdl.maogay.model.Student;
import pub.cdl.maogay.model.auth.RegisterReq;

@Mapper
public interface AuthDao {
    @Insert("INSERT INTO wxsb (name, student_ID, password, email)" +
        "VALUES (#{name}, #{student_ID}, #{password}, #{email})")
    int register(RegisterReq req);

    @Select("select * from wxsb where name = #{name} limit 1")
    Student getStuInfo(String name);

    @Select("select * from wxsb where student_ID = #{id} limit 1")
    Student getStuInfoById(String id);
}
