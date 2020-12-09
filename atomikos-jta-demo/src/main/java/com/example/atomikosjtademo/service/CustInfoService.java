package com.example.atomikosjtademo.service;

import com.example.atomikosjtademo.mapping.CustInfoMapper;
import com.example.atomikosjtademo.model.CustInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustInfoService {
    @Autowired
    private CustInfoMapper custInfoMapper;

    public CustInfo select(int ids) {
        CustInfo result = custInfoMapper.selectByPrimaryKey(ids);
        return result;
    }

    public int insert(CustInfo record) {
        int result = custInfoMapper.insert(record);
//        long now = System.currentTimeMillis();
////        // 模拟一个异常
////        if (now % 2 > -1) {
////            throw new RuntimeException("CustInfoMapper throws test insert exception");
////        }
        return result;
//        return 1;
    }

    public int update(CustInfo record) {
        int result = custInfoMapper.updateByPrimaryKey(record);
        return result;
    }

    public int delete(int ids) {
        int result = custInfoMapper.deleteByPrimaryKey(ids);
        return result;
    }

    public int insertWithHystrix(CustInfo record) {
        int result = custInfoMapper.insert(record);
//        long now = System.currentTimeMillis();
//        // 模拟一个异常
//        if (now % 2 > -1) {
//            throw new RuntimeException("CustInfoMapper throws test insert exception");
//        }
        return result;
    }
}