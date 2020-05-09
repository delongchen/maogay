package pub.cdl.maogay.model.upload;

import lombok.Getter;
import lombok.Setter;
import pub.cdl.maogay.model.ResponseMsg;

import java.util.List;

public class GetDataRes extends ResponseMsg {

    @Getter
    @Setter
    private List<String> value;
}
