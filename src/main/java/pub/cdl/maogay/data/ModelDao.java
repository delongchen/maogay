package pub.cdl.maogay.data;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pub.cdl.maogay.model.mm.MapModel;

import java.util.List;

@Mapper
public interface ModelDao {
    @Select("select * from wxsbmodel")
    List<MapModel> mapModels();
}
