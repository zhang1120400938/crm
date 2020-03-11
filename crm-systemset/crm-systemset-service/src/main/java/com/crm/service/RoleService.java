package com.crm.service;

import com.crm.bean.Role;
import com.crm.enums.ExceptionEnum;
import com.crm.exception.CrmException;
import com.crm.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public Role findById(Long id){
        if(id==null){
            throw new CrmException(ExceptionEnum.PARAM_IS_NUL);
        }
        return roleMapper.selectByPrimaryKey(id);
    }
}
