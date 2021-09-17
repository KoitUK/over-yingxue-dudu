package com.baizhi;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OverYingxueDuduApplicationTests {
       @Autowired
    private AdminDao dao;
    @Test
    void contextLoads() {
               List<Admin> adminList=dao.adminList();
        for (Admin admin : adminList) {
            System.out.println(admin);
        }
    }
    @Test
    public void test1(){
        Integer id=1;
        Admin admin=dao.selectAdmin(id);
        System.out.println(admin);
    }

}
