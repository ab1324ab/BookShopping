package com.hzit.serv.impl;

import com.hzit.dao.mapper.ModuleMapper;
import com.hzit.serv.ModuleService;
import com.hzit.vo.ModuleVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016/10/28.
 */
public class Modulempl implements ModuleService {
    @Autowired
    private ModuleMapper moduleMapper;
    @Override
    public List<ModuleVo> findModuleById() {

        return null;
    }
}
