package org.animalhelp.controller;

import org.animalhelp.mybatis.domain.Demo;
import org.animalhelp.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yinjianjun on 17-3-31.
 */

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public List<Demo> getDemo(){
        return demoService.getDemo();
    }

}
