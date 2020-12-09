package com.example.atomikosjtademo;

import com.example.atomikosjtademo.model.CustInfo;
import com.example.atomikosjtademo.model.User;
import com.example.atomikosjtademo.service.BatchInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/atomikos")
public class domeController {

    private Logger logger = LoggerFactory.getLogger(domeController.class);
    @Autowired
    private BatchInsertService batchInsertService;

    @PostMapping("select")
    public String select(@RequestBody User user) {
        long startTime = System.currentTimeMillis();
        int userid = user.getId();
        int cunids = user.getId();
        String result=batchInsertService.select(userid, cunids);
        long endTime = System.currentTimeMillis();
        logger.info("共耗时：{}毫秒", endTime - startTime);
        return result;
    }

    @PostMapping("insert")
    public String insert(@RequestBody User user) {
        long startTime = System.currentTimeMillis();
        CustInfo info = new CustInfo();
        info.setId(user.getId());
        info.setPhone(user.getAge() + "" + (int) (Math.random() * 100));
        batchInsertService.insert(user, info);
        long endTime = System.currentTimeMillis();
        logger.info("共耗时：{}毫秒", endTime - startTime);
        return "successful";
    }

    @PostMapping("update")
    public String update(@RequestBody User user) {
        long startTime = System.currentTimeMillis();
        CustInfo info = new CustInfo();
        info.setId(user.getId());
        info.setPhone(user.getAge() + "" + (int) (Math.random() * 100));
        batchInsertService.update(user, info);
        long endTime = System.currentTimeMillis();
        logger.info("共耗时：{}毫秒", endTime - startTime);
        return "successful";
    }

    @PostMapping("delete")
    public String delete(@RequestBody User user) {
        long startTime = System.currentTimeMillis();
        int userid = user.getId();
        int cunids = user.getId();
        batchInsertService.delete(userid, cunids);
        long endTime = System.currentTimeMillis();
        logger.info("共耗时：{}毫秒", endTime - startTime);
        return "successful";
    }
}
