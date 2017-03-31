package org.animalhelp.mybatis.mapper;

import lombok.extern.slf4j.Slf4j;
import org.animalhelp.mybatis.domain.Demo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yinjianjun on 17-3-31.
 */
@Component
@Slf4j
public class DemoMapper {

    @Autowired
    private transient SqlSessionTemplate sqlSessionTemplate;

    public List<Demo> getDemo(){
        Map<String, Object> paramMap= new HashMap();
        return this.sqlSessionTemplate.selectList("getDemo", paramMap);
    }

}
