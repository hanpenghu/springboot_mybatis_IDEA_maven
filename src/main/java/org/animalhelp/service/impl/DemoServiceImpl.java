package org.animalhelp.service.impl;

import org.animalhelp.mybatis.domain.Demo;
import org.animalhelp.mybatis.mapper.DemoMapper;
import org.animalhelp.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yinjianjun on 17-3-31.
 */
@Service
public class DemoServiceImpl implements DemoService {

    private final static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    private transient DemoMapper demoMapper;

    @Override
    public List<Demo> getDemo(){
        logger.info("我是{}", "getDemo");
        return demoMapper.getDemo();
    }
}
