package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdminDao {
    public List<Admin> adminList();
    public Admin selectAdmin(Integer id);
}
