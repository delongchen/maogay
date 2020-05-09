package pub.cdl.maogay.service;

import org.springframework.stereotype.Service;
import pub.cdl.maogay.data.DataDao;
import pub.cdl.maogay.model.upload.GetDataReq;
import pub.cdl.maogay.model.upload.GetDataRes;
import pub.cdl.maogay.model.upload.UploadBody;
import pub.cdl.maogay.model.upload.UploadDataRes;

@Service
public class UploadService {
    private DataDao data;

    public UploadService(DataDao dataDao) {
        this.data = dataDao;
    }

    public UploadDataRes insertData(UploadBody uploadBody) {
        var ret = new UploadDataRes();
        ret.setStatus("ok");
        ret.setMsg("" + data.InsertData(uploadBody));
        return ret;
    }

    public GetDataRes getData(GetDataReq getDataReq) {
        var ret = new GetDataRes();
        ret.setValue(data.getDataById(getDataReq.getStudent_ID()));
        ret.setMsg("get ok");
        ret.setStatus("ok");
        return ret;
    }

    public UploadDataRes insertImg(UploadBody uploadBody) {
        var ret = new UploadDataRes();
        ret.setStatus("ok");
        ret.setMsg("" + data.InsertImg(uploadBody));
        return ret;
    }

    public GetDataRes getImg(GetDataReq getDataReq) {
        var ret = new GetDataRes();
        ret.setValue(data.getImgById(getDataReq.getStudent_ID()));
        ret.setMsg("get ok");
        ret.setStatus("ok");
        return ret;
    }
}
