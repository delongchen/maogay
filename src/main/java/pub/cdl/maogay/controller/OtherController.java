package pub.cdl.maogay.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.cdl.maogay.model.upload.GetDataReq;
import pub.cdl.maogay.model.upload.GetDataRes;
import pub.cdl.maogay.model.upload.UploadBody;
import pub.cdl.maogay.model.upload.UploadDataRes;
import pub.cdl.maogay.service.UploadService;

@RestController
@RequestMapping("/upload")
public class OtherController {
    private UploadService uploadService;

    public OtherController(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @PostMapping("/dataInsert")
    public UploadDataRes insertDataRes(@RequestBody UploadBody uploadBody) {
        return uploadService.insertData(uploadBody);
    }

    @PostMapping("/imgInsert")
    public UploadDataRes insertImgRes(@RequestBody UploadBody uploadBody) {
        return uploadService.insertImg(uploadBody);
    }

    @PostMapping("/dataGet")
    public GetDataRes getData(@RequestBody GetDataReq getDataReq) {
        return uploadService.getData(getDataReq);
    }

    @PostMapping("/imgGet")
    public GetDataRes getImg(@RequestBody GetDataReq getDataReq) {
        return uploadService.getImg(getDataReq);
    }
}
