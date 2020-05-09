package pub.cdl.maogay.model.grade;

import lombok.Getter;
import lombok.Setter;
import pub.cdl.maogay.model.ResponseMsg;

import java.util.List;

@Setter
@Getter
public class GradeInfos extends ResponseMsg {
    private List<GradeBody> value;
}
