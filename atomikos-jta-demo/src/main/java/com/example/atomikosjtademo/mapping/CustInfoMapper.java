package com.example.atomikosjtademo.mapping;

import com.example.atomikosjtademo.model.CustInfo;

public interface CustInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CustInfo record);

    int insertSelective(CustInfo record);

    CustInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustInfo record);

    int updateByPrimaryKey(CustInfo record);
}
