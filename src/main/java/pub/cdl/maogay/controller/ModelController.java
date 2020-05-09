package pub.cdl.maogay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.cdl.maogay.data.ModelDao;
import pub.cdl.maogay.model.mm.MapModel;

import java.util.List;

@RestController
@RequestMapping("/model")
public class ModelController {
    @Autowired
    private ModelDao modelDao;

    @GetMapping("/all")
    public List<MapModel> getModelAll() {
        return modelDao.mapModels();
    }
}
